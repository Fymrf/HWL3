package com.example.hwl3;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n\nЧисло от 1 до 8 ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                change01();

            case 2:
                newArray100();

            case 3:
                X6();

            case 4:
                squareArr();

            case 5:
                int len = 10;
                int initialValue=5;
                System.out.println(Arrays.toString(fillArr(len, initialValue)));
                start();

            case 6:
                findMinMax();

            case 7:
                int[] mas=new int[]{2,2,2,4,4,6};
                System.out.print(checkBalance(mas));
                start();

            case 8:
                int[] mass=new int[]{1,3,5,7,9,11,13};
                int n=-4;
                System.out.println(Arrays.toString(shift(mass, n)));
                start();

            default:
                start();
        }
        in.close();
    }

    public static void change01(){
        byte[] mas = new byte[]{0,1,1,0,0,1,1,0,1,0};

        System.out.println("Исходный массив:");
        for (int i =0; i<mas.length;i++)
        {System.out.print(mas[i]);}

        for (int i =0; i<mas.length;i++)
        {
            if(mas[i]==1) {
                mas[i]=0;
            }
            else {mas[i]=1;}
        }

        System.out.println("\nНовый массив:");
        for (int i =0; i<mas.length;i++){
        System.out.print(mas[i]);}

        start();
    }

    public static void newArray100(){
        byte[] mas = new byte[100];
        for (byte i=0;i<100;i++)
        {
            mas[i]= (byte) (i+1);
            System.out.print(mas[i]+" ");
        }
        start();
    }

    public static void X6(){
        int[] mas = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.println("Исходный массив:");
        for (int ma : mas) {
            System.out.print(ma + " ");
        }

        System.out.println("\nНовый массив:");
        for (int i =0; i<mas.length;i++){
            if(mas[i]<6){
                mas[i]*=2;
            }
            System.out.print(mas[i]+" ");
        }
        start();
    }

    public static void squareArr(){
        byte r = 10;
        int[][] mas= new int[r][r];
        for (int i=0;i<r;i++){
            mas[i][r-1-i]=1;
            mas[i][i]=1;
            for (int j=0;j<r;j++){
                System.out.print(mas[i][j]+" ");
            }
            System.out.println();
        }
        start();
    }

    public static int[] fillArr(int len, int initialValue){
        int[] mas = new int[len];
        for (int i=0; i<len;i++)
        {
            mas[i]=initialValue;
        }
        return mas;
    }

    public static void findMinMax(){
        int[] mas = new int[]{1,7,5,3,6,8,9,6,4,3};
        OptionalInt min= Arrays.stream(mas).min();
        OptionalInt max= Arrays.stream(mas).max();
        System.out.println("Минимум: "+min+"\nМаксимум: "+max);
        start();
    }
    public static boolean checkBalance(int[] mas){
        int sumL=0;
        int sumR=Arrays.stream(mas).sum();
        for (int i=0; i<mas.length; i++)
        {
            if(sumL==sumR)
            {
                return true;
            }
            sumR-=mas[i];
            sumL+=mas[i];
        }
        return false;
    }
    public static int[] shift(int[] mass, int n){
        if (n>0){
            for (int i= 0; i< n; i++)
            {
               int le=mass[mass.length-1];
               for (int j= mass.length-1;j>0;j--)
               {
                   mass[j]=mass[j-1];
               }
               mass[0]=le;
            }
        } else if (n<0) {
            for (int i= 0; i>n; i--)
            {
                int fe=mass[0];
                for (int j= 0;j<mass.length-1;j++)
                {
                    mass[j]=mass[j+1];
                }
                mass[mass.length-1]=fe;
            }
        }
        return mass;
    }
}