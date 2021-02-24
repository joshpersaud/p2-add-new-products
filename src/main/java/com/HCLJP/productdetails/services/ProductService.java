package com.HCLJP.productdetails.services;

import com.HCLJP.productdetails.repository.ProductRepository;
import com.HCLJP.productdetails.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> retrieveAllProducts(){
        return productRepository.findAll();
    }

    public boolean saveProduct(Product product){

            BigDecimal bigDecimal = new BigDecimal("0");

            // if the values are valid, save the product.
            if(!product.getProductName().isBlank() &&
                    product.getProductPrice() != null && product.getProductPrice().compareTo(bigDecimal) > -1){

                productRepository.save(product);
                return true;
            }
            return false;
    }
}
