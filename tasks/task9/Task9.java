package task9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;

public class Task9 {

    public static void main(String[] args) {
        Train[] trains = new Train[5];
        Calendar time1 = GregorianCalendar.getInstance();
        time1.set(2019, 2,10,20,0);
        trains[0] = new Train("Moscow", 10, time1);
        Calendar time2 = GregorianCalendar.getInstance();
        time2.set(2019, 3,11,10,23);
        trains[1] = new Train("Berlin", 248, time2);
        Calendar time3 = GregorianCalendar.getInstance();
        time3.set(2019, 0,6,19,20);
        trains[2] = new Train("Paris", 3, time3);
        Calendar time4 = GregorianCalendar.getInstance();
        time4.set(2019, 10,20,5,19);
        trains[3] = new Train("London", 4754, time4);
        Calendar time5 = GregorianCalendar.getInstance();
        time5.set(2019, 6,25,7,50);
        trains[4] = new Train("Moscow", 15, time5);

        Arrays.sort(trains, new Comparator<Train>(){
            @Override
            public int compare(Train o1, Train o2) {
                return Integer.compare(o1.getNumber(), o2.getNumber());
            }
        });

        getDiscr(trains);//Вывод информации по номеру поезда
        myTrainSort(trains);//сортировка по заданию
        for(Train tr : trains){
            System.out.format("Поезд номер %d.\nПункт назначения - %s.\nВремя отправления %s.\n", tr.getNumber(), tr.getTo(), tr.getTimeFormat());
        }

    }
    public static void getDiscr(Train[] trains){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите номер поезда: ");
            int num = Integer.parseInt(reader.readLine());
            for(Train train:trains){
                if(num == train.getNumber()) {
                    System.out.format("Поезд номер %d.\nПункт назначения - %s.\nВремя отправления %s.\n", train.getNumber(), train.getTo(), train.getTimeFormat());
                    break;
                }
            }
        }
        catch (IOException e){}
    }

    public static void myTrainSort(Train[] trains){
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if(o1.getTo().compareTo(o2.getTo())!=0) return o1.getTo().compareTo(o2.getTo());
                else return o1.getTime().compareTo(o2.getTime());
            }
        });
    }
}
/*
Task9
Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления. Ввести данные в массив из пяти элементов типа train,
упорядочить элементы по номерам поездов. Добавить возможность вывода информации о поезде, номер которого введен пользователем.
Добавить возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

//
 */