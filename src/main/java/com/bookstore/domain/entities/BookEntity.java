package com.bookstore.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "tb_book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    @ManyToMany
    @JoinTable
    private List<GenreEntity> genres;

    @ManyToMany
    @JoinTable
    private List<AuthorEntity> authors;

    public BookEntity(){

    }

    public List<String> genreEntityToString(){

        List<String> listGenre =  new ArrayList<>();

        this.genres.forEach((l)->{
            listGenre.add(l.getDescription());
        });

        return listGenre;
    }
    public List<String> authorEntityToString(){

        List<String> listAuthor =  new ArrayList<>();

        this.authors.forEach((l)->{
            listAuthor.add(l.getName());
        });

        return listAuthor;
    }

}
