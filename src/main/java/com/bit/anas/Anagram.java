package com.bit.anas;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import java.util.*;

public class Anagram {

    public static void action(String[] text){
        StringBuilder sb = new StringBuilder();

        List<String> list= new ArrayList<String>();
        for(int i =0 ; i<= text.length-1;i++){
            for(int j=0;j<=text.length-1;j++){
                if(i!=j && isAnagram(text[i],text[j])){

                    if(!list.contains(text[i])){
                        list.add(text[i]);
                    }
                }
            }
        }

        for(String s:list){
            sb.append(s).append(" ");
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
