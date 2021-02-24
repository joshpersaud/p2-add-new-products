package com.HCLJP.productdetails.bootstrap;

import com.HCLJP.productdetails.repository.ProductRepository;
import com.HCLJP.productdetails.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Bootstrap implements CommandLineRunner {


    @Autowired
    ProductRepository productRepository;

    // putting initial data into H2 database

    @Override
    public void run(String... args) throws Exception {

        Product product = new Product();
        product.setProductName("TV");
        product.setProductPrice(BigDecimal.valueOf(1299.99));
        productRepository.save(product);

    }
}
