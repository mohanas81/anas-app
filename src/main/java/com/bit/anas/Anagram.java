package com.bit.anas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {

    public static void action(String[] text){
        StringBuilder sb = new StringBuilder();
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i =0 ; i<= text.length-1;i++){
            for(int j=0;j<=text.length-1;j++){
                if(i!=j && isAnagram(text[i],text[j])){
                    map.put(text[i],0);
                }
            }
        }

        for(Map.Entry m:map.entrySet()){
            sb.append(m.getKey()).append(" ");
        }

        System.out.println(sb.toString());
    }
    private static  Boolean isAnagram(String s1,String s2){
        char[] cs1= s1.toCharArray();
        Arrays.sort(cs1);
        char[] cs2 = s2.toCharArray();
        Arrays.sort(cs2);
        Boolean result = new String(cs1).equalsIgnoreCase(new String(cs2));

        return result;
    }
}
