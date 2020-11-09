package com.example.userservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String loginName; //登录名称
    private String name; // 姓名
    private String avatar; //头像
    private String memos; //信息备注
}
