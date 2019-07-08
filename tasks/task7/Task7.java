package task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Task7 {

    public static int method(double speed) throws IOException{
        //������� ����:
        Random random = new Random();
        Calendar today = GregorianCalendar.getInstance();
        int year = 2000+random.nextInt(20);//� 2000 ����;
        int mon = random.nextInt(12);
        int day;
        if(mon == 1 &&  isLeapYear(year)) day = random.nextInt(29)+1;
        else if (mon == 0 || mon == 2 || mon == 4 || mon == 6 || mon == 7 || mon == 9 || mon == 11) day = random.nextInt(31)+1;
        else day = random.nextInt(30)+1;
        today.set(year, mon, day);
        DateFormat format = new SimpleDateFormat("dd MM yyyy");
        System.out.println("������� " + format.format(today.getTime()));
        //���� ��������:
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("���� �������� (���� ����� ��� ����� ������):");
        String[] string = reader.readLine().split(" ");
        Calendar birthday = GregorianCalendar.getInstance();
        birthday.set(Integer.parseInt(string[2]), Integer.parseInt(string[1]) - 1, Integer.parseInt(string[0]));
        reader.close();
        //��������
        double one = 60;
        double two = 80;
        if(today.get(Calendar.DAY_OF_MONTH)==birthday.get(Calendar.DAY_OF_MONTH) && today.get(Calendar.MONTH)==birthday.get(Calendar.MONTH)){ //���� ���� �������� �������
            one+=5;
            two+=5;
        }
        if(speed<=one) return 0;
        else if(speed>one && speed<=two) return 1;
        else return 2;
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        try{
            System.out.println(method(85));
        }
        catch (IOException e){}
    }

}
/*
Task7
�� ����� ������� ������, � ����������� ������������� ���. �������� ��� ��� ���������� ����������,
�������������� ��� �������� ���� int: 0 = ��� ������, 1 = ��������� �����, 2 = ������� �����.
���� �������� ����� 60 ��� ������, ��������� ����� 0. ���� �������� ��������� ����� 61 � 80 ������������, ��������� ����� 1.
���� �������� ����� 81 ��� ������, ��������� ����� 2. ���� ��� �� ��� ���� �������� - � ���� ���� ��� �������� ����� ���� �� 5 ���� �� ���� �������.
������� ���� �������� ��������, ���� �������� �������� � ����������.

//
 */