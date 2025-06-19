package com.bookstore.service;

import com.bookstore.domain.dto.BookDto;
import com.bookstore.domain.entities.BookEntity;
import com.bookstore.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class BookService extends ServicesBase{

    @Autowired
    private BookRepository repository;

    public Page<BookDto> findAll(Pageable p) {

        Page<BookEntity> bookListPage = repository.findAll(p);

     

        return convertPage(bookListPage, BookDto::new);

    }

}
