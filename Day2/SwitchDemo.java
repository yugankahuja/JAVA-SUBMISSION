package com.ey;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String c=sc.next();
        switch (c) {
            case "r":{System.out.println("red");break;}
            case "g":{System.out.println("green");break;}
            case "b":{System.out.println("blue");break;}
            default: System.out.println("wrong color");
        }
    }
}
