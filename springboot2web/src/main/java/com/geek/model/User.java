package com.geek.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Robert
 * @create 2020/12/25 11:06
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userName;
    private String password;
}
