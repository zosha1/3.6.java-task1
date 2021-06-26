package ru.netology.domain;

import lombok.Data;

import java.util.Objects;
@Data
public class TShirt extends Product {
  private String color;
  private String size;
}
