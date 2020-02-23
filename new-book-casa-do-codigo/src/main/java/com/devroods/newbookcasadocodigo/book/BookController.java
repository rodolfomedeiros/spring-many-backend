package com.devroods.newbookcasadocodigo.book;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookController
 */
@RestController
@RequestMapping("/")
public class BookController {

  @PostMapping()
  public void putBook(@Valid NewBookForm form) {

  }
  
}