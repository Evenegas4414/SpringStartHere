package cl.exql.ch8.springherech8.service;

import cl.exql.ch8.springherech8.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();


    public void addProduct(Product p) {
        productList.add(p);
    }

    public List<Product> findAll() {
        return productList;
    }

}
