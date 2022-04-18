package dev.mkz.business.abstracts;

import dev.mkz.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
