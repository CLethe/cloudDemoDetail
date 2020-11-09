package com.example.mallweb;

import com.example.productservice.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Qualifier("PRODUCT-SERVICE")
    @Autowired
    private ProductService productService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list(){
        return this.productService.findAll();
    }
    @RequestMapping(value = "/{itemCode}", method = RequestMethod.GET)
    public Product detail(@PathVariable String itemCode){
        return this.productService.loadByItemCode(itemCode);

    }
}
