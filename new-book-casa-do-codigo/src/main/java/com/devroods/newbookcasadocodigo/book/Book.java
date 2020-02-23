package com.devroods.newbookcasadocodigo.book;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

public class Book {

	private @NotBlank @Size(max = 100) String title;
  private @NotBlank @Size(max = 50) String subTitle;
  private @Min(20) BigDecimal price;
  private @NotBlank String describe;
  private @NotBlank String summary;
  private @Min(100) int pages;
  private @NotBlank String isbn;
  private @NotBlank @URL String linkImg;

  public Book(@NotBlank @Size(max = 100) String title, @NotBlank @Size(max = 50) String subTitle,
      @Min(20) BigDecimal price, @NotBlank String describe, @NotBlank String summary, @Min(100) int pages,
      @NotBlank String isbn, @NotBlank @URL String linkImg) {
    this.title = title;
    this.subTitle = subTitle;
    this.price = price;
    this.describe = describe;
    this.summary = summary;
    this.pages = pages;
    this.isbn = isbn;
    this.linkImg = linkImg;
	}

  
}
