package beans;
// Generated 21.12.2016 19:55:33 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Book generated by hbm2java
 */
public class Book  implements java.io.Serializable {


     private boolean edit;
     private BigDecimal id;
     private Author author;
     private Publlisher publlisher;
     private String name;
     private BigDecimal year;
     private Set genreBooks = new HashSet(0);

    public Book() {
    }

	
    public Book(BigDecimal id, Author author, Publlisher publlisher, String name, BigDecimal year) {
        this.id = id;
        this.author = author;
        this.publlisher = publlisher;
        this.name = name;
        this.year = year;
    }
    public Book(BigDecimal id, Author author, Publlisher publlisher, String name, BigDecimal year, Set genreBooks) {
       this.id = id;
       this.author = author;
       this.publlisher = publlisher;
       this.name = name;
       this.year = year;
       this.genreBooks = genreBooks;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public Author getAuthor() {
        return this.author;
    }
    
    public void setAuthor(Author author) {
        this.author = author;
    }
    public Publlisher getPubllisher() {
        return this.publlisher;
    }
    
    public void setPubllisher(Publlisher publlisher) {
        this.publlisher = publlisher;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public BigDecimal getYear() {
        return this.year;
    }
    
    public void setYear(BigDecimal year) {
        this.year = year;
    }
    public Set getGenreBooks() {
        return this.genreBooks;
    }
    
    public void setGenreBooks(Set genreBooks) {
        this.genreBooks = genreBooks;
    }

    public boolean isEdit() {
        return edit;
    }

    public void setEdit(boolean edit) {
        this.edit = edit;
    }



}

