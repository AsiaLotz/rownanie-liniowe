package com.company;

import java.util.Scanner;

public class Liniowe {

    public static void main(String[] args) {
	float a,b;
        Scanner scan=new Scanner(System.in);
        //System.out.print("a=-x");
        System.out.println("Podaj a:");
        a=scan.nextFloat();
        //System.out.print("b=-ax");
        System.out.println("Podaj b:");
        b=scan.nextFloat();
        if(a==0)
            if(b==0)
                System.out.println("Równanie tożsamościowe");
            else
                System.out.println("Równanie sprzeczne");
        else {
            float x;
            x=-b/a;
            System.out.print("x=");
            System.out.println(x);
        }
    }
}
