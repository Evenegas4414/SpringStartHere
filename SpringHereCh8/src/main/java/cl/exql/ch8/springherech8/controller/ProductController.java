package cl.exql.ch8.springherech8.controller;

import cl.exql.ch8.springherech8.model.Product;
import cl.exql.ch8.springherech8.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @PostMapping("/products")
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {

        Product product =  new Product(name, price);
        product.setName(name);
        product.setPrice(price);
        productService.addProduct(product);

        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }

    @GetMapping("/add")
    public String add() {

        return "add.html";
    }

}
