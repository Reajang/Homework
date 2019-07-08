package task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task5 {

    public static void method()throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("������ �������: ");
        int n = Integer.parseInt(reader.readLine());
        double[] arr = new double[n];
        System.out.println("���������� �������");
        for(int i = 0; i < n; i++){
            arr[i] = Double.parseDouble(reader.readLine());
        }
        System.out.println(Arrays.toString(arr));
        double sum1 = 0, sum2 = 0;
        for(int j = 1; j<n; j++){

            for(int i1 = 0; i1<j; i1++) sum1+=arr[i1];
            for(int i2 = j; i2<n; i2++) sum2+=arr[i2];

            if(sum1 == sum2){
                System.out.println("����� = " + sum1);
                for(int i = 0; i<j; i++) System.out.print(arr[i] + " ");
                System.out.println();
                for(int i = j; i<n; i++) System.out.print(arr[i] + " ");
                System.out.println();
            }
            else{
                sum1 = 0;
                sum2 = 0;
            }
        }
    }

    public static void main(String[] args) {
        try{
            method();
        }
        catch (IOException e){}
    }
}
/*
Task5
������������� �������� ������ ����� � ��� �����������, ���� ���� ����� ��� ��������� ������� ���,
����� ����� ����� �� ����� ������� ���� ����� ����� ����� �� ������ ������� ������� �� ����� 2 �������
(������ �� ��� ���� �������� ������������ �������) � ����� ����� �������� ��������.

//
 */