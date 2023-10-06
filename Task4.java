package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        try {
            String string = br.readLine();
            if(string.equals("")) throw new RuntimeException("Это поле должно быть обязательно заполнено!");

            System.out.println(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

