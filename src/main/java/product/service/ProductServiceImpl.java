package product.service;

import product.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService{
    List<Product> productList = new ArrayList<>();

    public ProductServiceImpl() {
        productList.add(new Product(1, "Iphone", 1300));
        productList.add(new Product(2, "Samsung", 2000));
        productList.add(new Product(3, "Xiaomi", 1000));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public int findIndexOfProduct(int id) {
        int index = -1;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId()==id) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int findByName(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return 0;
    }

    @Override
    public Product findById(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
        }

    @Override
    public void update(int id, Product product) {
       int indexOf = findIndexOfProduct(id);
       productList.set(indexOf, product);
    }

    @Override
    public void delete(int id) {

    }
}
