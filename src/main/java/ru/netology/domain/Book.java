package ru.netology.domain;

import lombok.Data;

import java.util.Objects;
@Data
public class Book extends Product {
  private String author;
  private int pages;
  private int publishedYear;

  public Book() {
    super();
  }

  public Book(int id, String name, int price, String author, int pages, int publishedYear) {
    super(id, name, price);
    this.author = author;
    this.pages = pages;
    this.publishedYear = publishedYear;
  }
}
