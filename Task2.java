package org.example;

public class Task2 {
    public static void main(String[] args) {
        int d = 0;
        int[] intArray = {1,2,3,4,5,6,7,8,9};

        try {
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: На НОЛЬ делить нельзя");
        }
    }
}