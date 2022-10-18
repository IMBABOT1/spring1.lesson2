package ru.geekbrains.spring1.lesson2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Component
public class ProductRepository {

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>(Arrays.asList(
                new Product(1l, "first", 10),
                new Product(2l, "second", 10),
                new Product(3l, "third", 10),
                new Product(4l, "fourth", 10),
                new Product(5l, "five", 10)));
    }

    public List<Product> findALl(){
        return Collections.unmodifiableList(products);
    }

    public Product findById(Long id){
        for (Product p : products){
            if (p.getId() == id){
                return p;
            }
        }
        throw new RuntimeException("Product with id: " + id + " not found");
    }
}
