package com.bookstore.domain.dto;

import com.bookstore.domain.entities.BookEntity;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class BookDto {

    public BookDto(BookEntity book){

    }

    private String title;

    private String author;

    @Column(precision = 10, scale = 2)
    private BigDecimal price;

}
