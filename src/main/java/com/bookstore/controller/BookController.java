package com.bookstore.controller;

import com.bookstore.domain.dto.BookDto;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    @GetMapping("/all")
    public ResponseEntity<Page<BookDto>> findAll(Pageable p){
        return new ResponseEntity<>(service.findAll(p), HttpStatus.OK);
    }

    @GetMapping("/findBookById/{id}")
    public ResponseEntity<BookDto> findBookById(@PathVariable Long id){
        return new ResponseEntity<>(service.findBookById(id), HttpStatus.OK);
    }
}
