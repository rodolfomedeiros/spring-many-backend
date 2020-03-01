package com.devroods.newbookcasadocodigo.book;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 */
@RestController
@RequestMapping("/books")
public class BookController {

  @PostMapping("/post")
  public void putBook(@Valid NewBookForm form) {
    Book book = form.getBook();
  }
  
}