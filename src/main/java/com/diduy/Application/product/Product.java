package com.diduy.Application;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull(message = "Product name is required.")
  @Basic(optional = false)
  private String name;

  private Double price;

  private String pictureUrl;

  private String typeOfProduct;

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public void setTypeOfProduct(String typeOfProduct) {
    this.typeOfProduct = typeOfProduct;
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Double getPrice() {
    return price;
  }

  public String getTypeOfProduct() {
    return typeOfProduct;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }
}


