package product.service;

import product.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    void save(Product product);
    int findIndexOfProduct(int id);
    int findByName(String name);
    Product findById(int id);
    void update(int id, Product product);
    void delete(int id);
}
