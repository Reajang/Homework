package Task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import java.util.GregorianCalendar;

public class Task6 {

    public static boolean method(Calendar date, int sigNum){
        if(sigNum<40) return false;
        else if(sigNum > 60 & !isWeekEnd(date)) return false;
        return true;
    }
    private static boolean isWeekEnd(Calendar cal){
        if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY || cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) return true;
        else return false;
    }

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("������� ���-�� �����:");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("����(���� ����� ��� ����� ������):");
            String[] string = reader.readLine().split(" ");
            Calendar calendar = GregorianCalendar.getInstance();
            calendar.set(Integer.parseInt(string[2]), Integer.parseInt(string[1]) - 1, Integer.parseInt(string[0]));
            System.out.println(method(calendar, x));
        }
        catch (IOException e){}
    }
}
/*
Task6
����� ����� ���������� �� ���������, �� �������� ������ ������. ��������� �������, ����� ���������� ����� ���������� �� 40 �� 60 ������������.
 ���� ��� �� ��������, � ���� ������ �� ���������� ������� ������� ���������� �����.
 ������� true, ���� ������ � ��������� ���������� �������, ��� false � ��������� ������.

//
 */