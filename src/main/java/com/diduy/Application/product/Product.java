package com.diduy.Application;

import jakarta.validation.constraints.NotNull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
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

  public Product(String _name, Double _price) {
    this.name = _name;
    this.price = _price;
  }

  public Product(String _name, Double _price, String _pictureUrl) {
    this.name = _name;
    this.price = _price;
    this.pictureUrl = _pictureUrl;
  }
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
