package com.atguigu.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jinshijian
 * @date 2018/10/11-20:10
 */

public class TemplatesTest {
    public static void main(String[] args) {
        System.out.println("模板演示");
        String[] strs = new String[]{"hanmeimei","sunleilei","lixiaogang"};
        //fori
        for (int i = 0; i <strs.length ; i++) {
            System.out.println(strs[i]);
        }
        //iter
        for (String s : strs) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
        }
        List list = new ArrayList();
        list.add(123);
        list.add("3242343");
        //list.for 增强遍历
        for (Object o : list) {
            
        }
        //list.fori 正序遍历
        for (int i = 0; i < list.size(); i++) {
            
        }
        //list.forr 倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //null判断
        if (list == null) {

        }
        //!null判断
        if (list != null) {

        }
    }
    //prsf
    private static final Customer CUS = new Customer();
    //psf

}
