package com.github.anole;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Test class
 *
 * @author db1995
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnoleApplicationTests {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        String createSQL = "CREATE TABLE pepole("
                + "name varchar(10) not null,"
                + "age int(4) not null"
                + ")charset=utf8;";
        List<String> list = jdbcTemplate.queryForList("show tables", String.class);
        System.out.println("list = " + list);
        jdbcTemplate.execute("show databases");
    }

}
