package com.cjc.controller;

import com.cjc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: CJC
 * @Date： 2021-07-20 00:11
 */
@Controller
public class TableController {

    @GetMapping("/basic_table")
    public String basic_table() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model) {
        //表格内容的遍历
        List<User> users = Arrays.asList(new User("张三", "123456"),
                new User("lisi", "123456"),
                new User("haha", "aaaaaa"),
                new User("hehe", "aaddd"));
        model.addAttribute("users", users);
        return "table/dynamic_table";
    }

    @GetMapping("/table_out")
    public String responsive_table() {
        return "table/table_out";
    }

    @GetMapping("/goods_table")
    public String goods_table() {
        return "table/goods_table";
    }

    @GetMapping("/category_table")
    public String category_table() {
        return "table/category_table";
    }

    @GetMapping("/application_out")
    public String application_out() {
        return "application/application_out";
    }

    @GetMapping("/application_in")
    public String application_in() {
        return "application/application_in";
    }

    @GetMapping("/chartjs")
    public String chartjs() {
        return "charts/chartjs";
    }

    @GetMapping("/depository_add")
    public String depository_add() {
        return "depository/depository_add";
    }

    @GetMapping("/category_add")
    public String category_add() {
        return "depository/category_add";
    }
    @GetMapping("/goods_edit")
    public String goods_edit() {
        return "depository/goods_edit";
    }
    @GetMapping("/category_edit")
    public String category_edit() {
        return "depository/category_edit";
    }


}
