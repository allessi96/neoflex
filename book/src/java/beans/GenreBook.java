package beans;
// Generated 21.12.2016 19:55:33 by Hibernate Tools 4.3.1



/**
 * GenreBook generated by hbm2java
 */
public class GenreBook  implements java.io.Serializable {


     private GenreBookId id;
     private Book book;
     private Genre genre;

    public GenreBook() {
    }

    public GenreBook(GenreBookId id, Book book, Genre genre) {
       this.id = id;
       this.book = book;
       this.genre = genre;
    }
   
    public GenreBookId getId() {
        return this.id;
    }
    
    public void setId(GenreBookId id) {
        this.id = id;
    }
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    public Genre getGenre() {
        return this.genre;
    }
    
    public void setGenre(Genre genre) {
        this.genre = genre;
    }




}


