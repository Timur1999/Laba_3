package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        byte a;
        a = 0;
        System.out.println("Выберите задачу:");
        a=scan.nextByte();
        switch (a){
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;

            default:
                break;
        }

    }

    public  static  void Task1(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Проверка теоремы Ферма.\n" +
                "Введите степень n>2, чтобы проверить существуют ли три числа в диапазоне от 1 до 100,\n" +
                " соответствующие условию а^+b^n=c^n");
        int a=0;
        int b=0;
        int c=0;
        int n=0;
        int limit=101;
        double result=0;
        boolean flag=false;
        System.out.println("Задайте степень  :");
        while (true) {
            n = scan.nextInt();
            if(n>2)
                break;
            System.out.println("Значение степени должно быть более двух!");
        }

        for (a = 1; a <limit ; a++) {
            for (b = 1; b < limit; b++) {
                for (c = 1; c < limit; c++) {
                    result= Math.pow((double)a,(double)n) +
                            Math.pow((double)b,(double)n);
                    if(result==Math.pow((double)c,(double)n)) {
                        flag =true;
                        System.out.println("Решение найдено!\na="+a+
                                " b="+b+" c="+c);
                    }

                }
            }
        }
        if(flag==false)
            System.out.println("Для заданных чисел и степени решения не найдено.");

        int section=0;
        System.out.println("Проверить решения для n=2?\n" +
                "(нажмите 1 )");
        section=scan.nextInt();
        switch (section){
            case 1:
                n=2;
                for (a = 1; a <limit ; a++) {
                    for (b = 1; b < limit; b++) {
                        for (c = 1; c < limit; c++) {
                            result= Math.pow((double)a,(double)n) +
                                    Math.pow((double)b,(double)n);
                            if(result==Math.pow((double)c,(double)n)) {
                                flag =true;
                                System.out.println("Решение найдено!\na="+a+
                                        " b="+b+" c="+c);
                            }

                        }
                    }
                }


                break;
            default:
                break;
        }

    }

    public static void Task2(){
        double result=0;

        System.out.println("Вычисление значения выражения 1-1/2+1/3-1/4+...+1/9999-1/10000");
        for (int i = 1; i < 10000; i++) {
            if(i%2==0)
                result-=1/i;
            else
                result+= 1/i;
            i++;
        }

        System.out.println("1-1/2+1/3-1/4+...+1/9999-1/10000="+result);
    }
}
