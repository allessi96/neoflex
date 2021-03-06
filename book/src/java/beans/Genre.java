package beans;
// Generated 21.12.2016 19:55:33 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Genre generated by hbm2java
 */
public class Genre  implements java.io.Serializable {


     private BigDecimal id;
     private String name;
     private Set genreBooks = new HashSet(0);

    public Genre() {
    }

	
    public Genre(BigDecimal id, String name) {
        this.id = id;
        this.name = name;
    }
    public Genre(BigDecimal id, String name, Set genreBooks) {
       this.id = id;
       this.name = name;
       this.genreBooks = genreBooks;
    }
   
    public BigDecimal getId() {
        return this.id;
    }
    
    public void setId(BigDecimal id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Set getGenreBooks() {
        return this.genreBooks;
    }
    
    public void setGenreBooks(Set genreBooks) {
        this.genreBooks = genreBooks;
    }




}


