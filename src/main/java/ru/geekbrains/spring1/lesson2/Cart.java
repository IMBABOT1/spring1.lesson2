package ru.geekbrains.spring1.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;


@Component
@Scope("prototype")
public class Cart {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
    }

    public void addProductById(Long id) {
        products.add(productService.findById(id));
    }

    public Product deleteProductById(Long id){
        Product p = productService.findById(id);
        products.remove(p);
        return p;
    }

    public List<Product> findAll(){
        return products;
    }
}
