package com.example;


public class Task {
        public static void main(String[] args) {
           String str ="I like Java!!!";
           if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!"))
           {System.out.println(str.toUpperCase());}
           String newStr=str.replace("a","o");
           System.out.println(newStr.substring(7,11));
        }
}
