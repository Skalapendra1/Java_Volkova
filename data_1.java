package com.max.idea;


public class data_1 {
    public static void main(String[] args) {
        String st = "I like Java!!!";
        boolean a = st.contains("Java");
        boolean a1 = st.startsWith("I like");
        boolean a2 = st.endsWith("!!!");
        if ((a=true) & (a1=true)&(a2=true)){

            System.out.println(st.toUpperCase());
        }
        String r = st.replace('a','o');
        System.out.println(r.substring(7,11));

    }
}
