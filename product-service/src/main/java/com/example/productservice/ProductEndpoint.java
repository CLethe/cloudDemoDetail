package com.example.productservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductEndpoint {
    protected Logger logger = LoggerFactory.getLogger(ProductEndpoint.class);
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list(){
        return this.buildProducts();
    }
    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode){
        List<Product> products = this.buildProducts();
        for (Product product : products) {
            if (product.getItemCode().equalsIgnoreCase(itemCode)) return product;
        }
        return null;
    }

    protected List<Product> buildProducts(){
        List<Product> products = new ArrayList<>();
        products.add(Product.builder().itemCode("item-1")
                .name("测试商品-1").bandName("ThisisBandName")
                .price(100).build());
        products.add(Product.builder().itemCode("item-2")
                .name("测试商品-2").bandName("ThisisBandName")
                .price(200).build());
        products.add(Product.builder().itemCode("item-3")
                .name("测试商品-3").bandName("ThisisBandName")
                .price(300).build());
        products.add(Product.builder().itemCode("item-4")
                .name("测试商品-4").bandName("ThisisBandName")
                .price(400).build());
        products.add(Product.builder().itemCode("item-5")
                .name("测试商品-5").bandName("ThisisBandName")
                .price(500).build());
        return products;
    }
}
