package dev.andreina.ex_java_loops;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("--------Multiplication Table-----------");
        System.out.print("Ingrese un número al que quiere generar la tabla de multiplicar : ");
        int number = scanner.nextInt();
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println( number + " x " + i + " = " + result);
        }


    }
}
