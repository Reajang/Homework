package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Task1 {

    public static void method() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое слово: ");
        String word1 = reader.readLine();
        System.out.println("Введите второе слово: ");
        String word2 = reader.readLine();
        reader.close();
        HashSet<Character> res = new HashSet<>();
        for(char x : word1.toCharArray()){
            for(char y : word2.toCharArray()){
                if(x == y) res.add(x);
            }
        }
        System.out.println("Символы, которые встречаются в обоих словах: " + res);
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch (IOException e){}
    }
}
/*
* Task1
Даны два слова. Найдите только те символы слов, которые встречаются в обоих словах только один раз.
Слова вводятся пользователем.

//
* */