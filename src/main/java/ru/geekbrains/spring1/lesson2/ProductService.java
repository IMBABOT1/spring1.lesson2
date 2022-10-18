package ru.geekbrains.spring1.lesson2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findALl(){
        return productRepository.findALl();
    }

    public Product findById(Long id){
        return productRepository.findById(id);
    }
}
