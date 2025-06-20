package com.bookstore.domain.dto;

import com.bookstore.domain.entities.BookEntity;
import com.bookstore.domain.entities.GenreEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

@Slf4j
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto implements Serializable {

    private String title;

    private List<String> authors;

    private List<String> genres;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

    public BookDto(BookEntity book){
        this.title = book.getTitle();
        this.authors = book.authorEntityToString();
        this.price = book.getPrice();
        this.genres = book.genreEntityToString();
    }



}
