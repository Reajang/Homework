package task10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        Customer[] arr = new Customer[5];
        arr[0] = new Customer("H", "A", "LR", "123", 4893, 123456789);
        arr[1] = new Customer("E", "Y", "O", "321", 9435, 987654321);
        arr[2] = new Customer("B", "R", "J", "2347", 4235, 147258369);
        arr[3] = new Customer("O", "D", "C", "8567", 9783, 741852963);
        arr[4] = new Customer("E", "A", "DWE", "963", 1567, 852369147);

        Arrays.sort(arr);

        for(Customer customer:arr){
            System.out.println(customer);
        }

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите диапазон. От: ");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("До: ");
            int y = Integer.parseInt(reader.readLine());
            for(Customer customer:arr){
                if(customer.getNumcard()>=x && customer.getNumcard()<=y) System.out.println(customer);
            }
        }
        catch (IOException e){}
    }

}
/*Task10
Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета; Конструктор; Методы: установка значений атрибутов,
получение значений атрибутов, вывод информации. Создать массив объектов данного класса.
 Вывести список покупателей в алфавитном порядке и список покупателей, у которых номер кредитной карточки находится в заданном диапазоне.*/