package com.lemon.day08.map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        //HashMap
        HashMap<String,String> map = new HashMap<>();
        //put 添加和修改
        map.put("num1","王二麻子");
        map.put("num1","王小二");          //重复put  修改值
        map.put("num2","刘亦菲");
        map.put("num3","罗志祥");
        map.put("num4","刘亦菲");
        map.put("num5","刘亦菲");
        System.out.println(map);

        //get(key)方法：通过键找值
        String value = map.get("num1");
        System.out.println(value);
        System.out.println(map.size());

        //containsKey   判断键是否存在
        Boolean b = map.containsKey("num4");
        System.out.println(b);
        if (b){
            System.out.println("num4存在");
        }else {
            System.out.println("num4不存在");
        }

        //remove   移除
        map.remove("num5");
        System.out.println(map);
    }
}
