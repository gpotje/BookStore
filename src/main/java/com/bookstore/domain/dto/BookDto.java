package com.bookstore.domain.dto;

import com.bookstore.domain.entities.BookEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {

    public BookDto(BookEntity book){
        this.title = book.getTitle();
        this.author = book.getAuthor();
        this.price = book.getPrice();

    }

    private String title;

    private String author;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

}
