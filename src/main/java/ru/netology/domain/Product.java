package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
  private int id;
  private String name;
  private int price;
}
