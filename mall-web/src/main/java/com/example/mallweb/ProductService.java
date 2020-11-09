package com.example.mallweb;

import com.example.productservice.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

// value的值会作为服务名称，用于服务发现
@FeignClient(value = "PRODUCT-SERVICE", fallback = ProductServiceFallback.class)
public interface ProductService {
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();
    @RequestMapping(value = "/products/{itemCode}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("itemCode") String itemCode);
}
