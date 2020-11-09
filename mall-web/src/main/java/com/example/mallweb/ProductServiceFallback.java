package com.example.mallweb;

import com.example.productservice.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class ProductServiceFallback implements ProductService {
    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(@PathVariable String itemCode) {
        return Product.builder().itemCode("error")
                .name("未知")
                .bandName("This is BandName")
                .price(0)
                .build();
    }
}
