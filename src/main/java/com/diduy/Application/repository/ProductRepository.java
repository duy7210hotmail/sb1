package com.diduy.Application;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import org.springframework.stereotype.Service;

import com.diduy.Application.Product;
import com.diduy.Application.ProductService;


@Service
public class ProductRepository implements ProductService {

  private static Map<Long, Product> productRepository = new HashMap<>();

  static {
    Product book1 = new Product("book1", 200.0);
    productRepository.put(book1.getId(), book1);

    Product book2 = new Product("book2", 230.0);
    productRepository.put(book2.getId(), book2);
  }

  @Override
  public void createProduct(Product product) {
    productRepository.put(product.getId(), product);
  }
/*
  @Override
  public void deleteProduct(Product product) {
    productRepository.remove(product.getId());
  }

  @Override
  public Collection<Product> getProducts() {
    return productRepository.values();
  }
*/
}
