package com.hello.java;

import java.util.ArrayList;

public class HelloWorld {
    //模板6 prsf
    private static final String hello = "sdf";
    //变形扩展 psf
    public static final String hi = "sdf";
    //psfi
    public static final int sdf= 52;
    public static final String df="dsf";


    //模板1：psvm
    public static void main(String[] args) {
        //模板2:sout
        System.out.println("hi man");
        //sout 扩展soutp/soutm/soutv

        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        int num = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);
        System.out.println("num = " + num);

        //模板3 fori
        String [] arr = new String[]{"ss","ff","fds"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String arrs:arr
        ) {
            System.out.println(arrs);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }

        //模板4 list.for
        ArrayList list = new ArrayList();
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    }

    public void method(){
        //模板5 ifn
        ArrayList list = new ArrayList();
        list.add(56);

        if (list == null) {

        }
        //变形扩展
        if (list != null) {

        }

        //变形扩展 xxx.nn/xxx.null
        if (list != null) {

        }
        if (list == null) {

        }


    }

}
