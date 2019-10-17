package com.bit.anas;

import java.util.Arrays;
import java.util.List;

public class BelahString {
    static String[] s1={"pro", "gram", "merit", "program", "it", "programmer"};

    public static void action(String s2){
        int min=getMinString(s1);
        int max= getMaxString(s1);
        if(max>s2.length()){
            max=s2.length();
        }
        StringBuilder sbAdd = new StringBuilder();;
        StringBuilder sbDel= null;
        for (int i =min; i<=max;i++){

            sbDel =new StringBuilder(s2);

            String str= s2.substring(0,i);
            for(int x=0;x<s1.length;x++){
                String xStr= s1[x];
                if(str.equalsIgnoreCase(xStr)){
                    sbDel.delete(0,str.length());
                    sbAdd.append(str);
                    break;
                }
            }
            if(sbAdd.length()>0 && ! sbDel.toString().equalsIgnoreCase(s2)) {
            for(int z=0;z<s1.length;z++){
                if(sbDel.indexOf(s1[z])>=0){
                    sbDel.delete(0,s1[z].length());
                    sbAdd.append(",").append(s1[z]);
                }
            }
                sbAdd.append("\n");
            }

        }

        System.out.println(sbAdd.toString());

    }

    private static int getMinString(String[] str){
        int min = str[0].length();
        for(String s:str){
            if(s.length()<min){
                min=s.length();
            }
        }

        return min;
    }
    private static int getMaxString(String[] str){
        int max = 0;
        for(String s:str){
            if(s.length()>max){
                max=s.length();
            }
        }

        return max;
    }




}
