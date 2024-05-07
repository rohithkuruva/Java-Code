package org.example;

public class Test {
    public static void main(String[] args) {
        char[] str={'a','b','c'};
        for(int i=0,e=str.length-1;i<=e;++i){
            if(Character.isLetter(str[i]) && Character.isLowerCase(str[i])){
                str[i]=(char)(str[i]-32);
            }
        }
        System.out.println(str);
    }
}
