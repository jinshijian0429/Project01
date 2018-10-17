package com.atguigu.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 这是一个类
 */
public class Customer {


    public Customer() {
    }

    /*
            这是主程序
             */
    public static void main(String[] args) {
        System.out.print("HelloIDEA!!!");
        Date date = new Date();
        List list = new ArrayList();
        list.add(0, "123");
//        method();

    }

    public static void method1() {
        try {
            FileInputStream file = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
