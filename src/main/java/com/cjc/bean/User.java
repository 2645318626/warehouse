package com.cjc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: CJC
 * @Date： 2021-07-19 23:42
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String username;
    private String password;
}
