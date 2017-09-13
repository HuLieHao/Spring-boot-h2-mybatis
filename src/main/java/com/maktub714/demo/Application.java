package com.maktub714.demo;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.maktub714.demo.dao.mapper.UserMapper;
import com.maktub714.demo.dao.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner{

    @Autowired
    private UserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


    public void run(String... strings) throws Exception {
        PageHelper.startPage(1, 20);
        List<User> countries = userMapper.selectAll();
        System.out.println("Total: " + ((Page) countries).getTotal());
        for (User country : countries) {
            System.out.println("User Name: " + country.getUsername());
        }
    }
}
