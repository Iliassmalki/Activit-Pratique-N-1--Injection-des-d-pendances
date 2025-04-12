package org.example.devoir2;

import org.example.devoir2.Entities.Product;
import org.example.devoir2.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@SpringBootApplication
public class Devoir2Application implements CommandLineRunner {
    @Autowired
private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Devoir2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
productRepository.save(new Product(null,"computer","450",4));
productRepository.save(new Product(null,"computer","4750",4));
productRepository.save(new Product(null,"sofa","4850",4));
productRepository.save(new Product(null,"cosr","4520",4));
List <Product> products = (List<Product>) productRepository.findAll();
for (Product product : products) { System.out.println(product); }

Product product = productRepository.findById(Long.valueOf(1)).get();
System.out.println("************************************");
System.out.println(product.getId());
System.out.println(product.getName());
System.out.println(product.getPrice());
System.out.println(product.getQuantity());
System.out.println("************************************");
productRepository.findByNameContains("c").forEach(System.out::println);
        System.out.println("************************************");
        productRepository.search("%c%").forEach(System.out::println);
        System.out.println("************************************");
        productRepository.findByPriceGreaterThan("4000").forEach(System.out::println);
}}
