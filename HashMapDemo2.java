package com.lemon.day08.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMapDemo2 {
    public static void main(String[] args) {
        //HashMap 遍历
        HashMap<String,String> map = new HashMap<>();
        map.put("num1","王二麻子");
        map.put("num1","王小二");          //重复put  修改值
        map.put("num2","刘亦菲");
        map.put("num3","罗志祥");
        map.put("num4","刘亦菲");
        map.put("num5","刘亦菲");

        String value = map.get("num4");
        System.out.println(value);
        //第一种遍历方式：keyset()+get()
        //返回所有键的集合  set,泛型接收；
        Set<String> keyset= map.keySet();
        for (String key:keyset) {
            //通过键找值
           String value2 = map.get(key);
           System.out.println( key+"="+value2 );
        }

        //第二种遍历方式：entryset()   entry=key+value
        System.out.println("================================================");
        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
