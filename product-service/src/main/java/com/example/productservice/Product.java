package com.example.productservice;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private static final long serialVersionUID = 1L;
    private String itemCode; // 产品编号
    private String name; // 产品名称
    private String bandName; // 产品品牌名称
    private int price; // 产品价格（分）
}
