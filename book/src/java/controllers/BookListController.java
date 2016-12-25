package controllers;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import beans.Pager;
import db.DataHelper;
import beans.Book;

@ManagedBean(eager = true)
@SessionScoped
public class BookListController implements Serializable {

    private Long selectedAuthorId;// текущий автор книги из списка при редактировании книги
    // критерии поиска
    private long selectedGenreId; // выбранный жанр
    private Pager<Book> pager = new Pager<Book>();
 
    //-------
    private boolean editModeView;// отображение режима редактирования

    public BookListController() {
        fillBooksAll();
    }

    private void submitValues( int selectedPageNumber, long selectedGenreId) {
        
        pager.setSelectedPageNumber(selectedPageNumber);
        this.selectedGenreId = selectedGenreId;
    }

    //<editor-fold defaultstate="collapsed" desc="запросы в базу">
    private void fillBooksAll() {

        DataHelper.getInstance().getAllBooks(pager);

    }

    public String fillBooksByGenre() {

        row = -1;

        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();

        selectedGenreId = Long.valueOf(params.get("genre_id"));

        submitValues( 1, selectedGenreId);
        DataHelper.getInstance().getBooksByGenre(selectedGenreId, pager);

        return "books";
    }

    public void updateBooks() {

        cancelEditMode();
    }
    public void showEdit() {
        row=-1;
        editModeView = true;
    }

    public void cancelEditMode() {
        editModeView = false;
        for (Book book : pager.getList()) {
            book.setEdit(false);
        }
    }

    public void changeBooksCountOnPage(ValueChangeEvent e) {
        row = -1;
        cancelEditMode();
        pager.setBooksCountOnPage(Integer.parseInt(e.getNewValue().toString()));
        pager.setSelectedPageNumber(1);
        DataHelper.getInstance().runCurrentCriteria();
    }

    public void selectPage() {
        row = -1;
        cancelEditMode();
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        pager.setSelectedPageNumber(Integer.valueOf(params.get("page_number")));
        DataHelper.getInstance().runCurrentCriteria();
    }

    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="гетеры сетеры">
    public boolean isEditMode() {
        return editModeView;
    }

    private transient int row = -1;

    public int getRow() {
        row += 1;
        return row;
    }

    public long getSelectedGenreId() {
        return selectedGenreId;
    }

    public void setSelectedGenreId(int selectedGenreId) {
        this.selectedGenreId = selectedGenreId;
    }


    public Long getSelectedAuthorId() {
        return selectedAuthorId;
    }

    public void setSelectedAuthorId(Long selectedAuthorId) {
        this.selectedAuthorId = selectedAuthorId;
    }

    public Pager getPager() {
        return pager;
    }
    //</editor-fold>
}
