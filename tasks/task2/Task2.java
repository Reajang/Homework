package task2;

import java.util.Random;

public class Task2 {

    public static String method(){
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<7; i++){
            if(i < 4) builder.append(random.nextInt(10)); //Первые четыре символа - цифры
            else if(i>3 & i<6){ // 2 буквы латинского алфавита
                //65-90 97-122
                while(true) {
                    int letter = 65 + random.nextInt(123 - 65);
                    if(letter >=91 & letter <= 96) continue;
                    builder.append((char) letter);
                    break;
                }
            }
            else{ //последние 4 символа
                while(true){
                    StringBuilder temp = new StringBuilder();
                    for(int j=0; j<4; j++){
                        temp.append(random.nextInt(2));
                    }
                    if(temp.toString().contains("1")) {
                        builder.append(temp);
                        break;
                    }
                }
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            System.out.println(method());
        }
    }
}
/*
Task2
Написать генерацию строк длины 10, причем первые 4 символа - цифры, следующие два символы - различные буквы,
следующие 4 символа - нули или единицы, причем одна единица точно присутствует.

//
 */