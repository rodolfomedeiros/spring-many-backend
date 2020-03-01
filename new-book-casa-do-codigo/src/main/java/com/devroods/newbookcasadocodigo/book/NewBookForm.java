package com.devroods.newbookcasadocodigo.book;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

public class NewBookForm {

	@NotBlank
	@Size(max = 100)
	private String title;
	@NotBlank
	@Size(max = 50)
	private String subTitle;
	@Min(20)
	private BigDecimal price;
	@NotBlank
	private String describe;
	@NotBlank
	private String summary;
	@Min(100)
	private int pages;
	@NotBlank
	private String isbn;
	@NotNull
	private MultipartFile img;
	@NotNull
	private Long authorId;
	


	public NewBookForm(@NotBlank @Size(max = 100) String title, @NotBlank @Size(max = 50) String subTitle,
			@Min(20) BigDecimal price, @NotBlank String describe, @NotBlank String summary, @Min(100) int pages,
			@NotBlank String isbn, @NotBlank MultipartFile img) {
		this.title = title;
		this.subTitle = subTitle;
		this.price = price;
		this.describe = describe;
		this.summary = summary;
		this.pages = pages;
		this.isbn = isbn;
		this.img = img;
	}	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public MultipartFile getImg() {
		return img;
	}

	public void setImg(MultipartFile img) {
		this.img = img;
	}

	public Book getBook() {
		return new Book(title,subTitle,price,describe, summary, pages, isbn, "https://s3/img");
	}

	public Long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}

}
