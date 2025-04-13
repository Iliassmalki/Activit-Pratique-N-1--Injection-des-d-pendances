package org.example.devoir2.web;

import org.example.devoir2.Entities.Product;
import org.example.devoir2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    ProductRepository productRepository;
@GetMapping("/products")
    public List<Product> products (){
        return (List<Product>) productRepository.findAll();

}
    @GetMapping("/products/{id}")
    public Product findproduct (@PathVariable Long  id){
        Product product=  productRepository.findById(id).orElse(null);
return  product;
    }
}
