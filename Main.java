package com.company;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(in);

        System.out.println("= ");
        int h = scanner.nextInt();
        int res=h/24; //50 /24 =2
        int s =  h - (res * 24); // 50-(2*24) 50-48=2

        System.out.println(res+" kun "+s+" soat");





       }

}
