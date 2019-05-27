package com.github.anole.gen.controller;

import com.github.anole.gen.service.MysqlGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller of MySQL generator
 *
 * @author db1995
 */
@RestController
@RequestMapping("/gen/mysql")
public class MysqlGeneratorController {
    @Autowired
    private MysqlGeneratorService mysqlGeneratorService;

    @PostMapping("/createTable")
    public void createTable(/*TODO Some parameter of table structure*/) {
        mysqlGeneratorService.createTable();
    }
}
