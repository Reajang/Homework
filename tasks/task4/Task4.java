package task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Task4 {

    private static Integer[] res;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr1;
        int[] arr2;
        while(true) {
            System.out.println("����������� ������� �������: ");
            int count1 = Integer.parseInt(reader.readLine());
            if (count1 < 4) {
                System.out.println("�� ����� 4 ����� �����");
                continue;
            }
            arr1 = new int[count1];
            System.out.println("�������� ������� �������(����� ������):");
            String[] string1 = reader.readLine().split(" ");
            if(string1.length!=count1){
                System.out.println("������� �������� ���-�� ��������");
                continue;
            }
            for (int i = 0; i < count1; i++) {
                arr1[i] = Integer.parseInt(string1[i]);
            }
            break;
        }//���������� ������� �������
        while(true){
            System.out.println("����������� ������� �������: ");
            int count2 = Integer.parseInt(reader.readLine());
            if (count2<4){
                System.out.println("�� ����� 4 ����� �����");
                continue;
            }
            arr2 = new int[count2];
            System.out.println("�������� ������� �������(����� ������):");
            String[] string2 = reader.readLine().split(" ");
            if(string2.length!=count2){
                System.out.println("������� �������� ���-�� ��������");
                continue;
            }
            for(int i=0; i<count2; i++){
                arr2[i]=Integer.parseInt(string2[i]);
            }
            break;
        }//���������� ������� �������
        reader.close();

        set(arr1, arr2);
        System.out.println("�������� ������: " + Arrays.toString(get()));
    }

    public static Integer[] get(){
        return res;
    }

    public static void set(int[] x, int[] y){

        int xhalf = x.length%2 == 0 ? x.length/2 : x.length/2+1;
        int yhalf = y.length%2 == 0 ? y.length/2 : y.length/2+1;
        res = new Integer[xhalf + yhalf];
        int rescount = 0;
        for(int i = (x.length-xhalf)/2; i<(x.length+xhalf)/2; i++) res[rescount++] = x[i];
        for(int i = (y.length-yhalf)/2; i<(y.length+yhalf)/2; i++) res[rescount++] = y[i];

        Random random = new Random();
        Arrays.sort(res, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return random.nextInt(3)-1;
            }
        });
    }
}
/*
Task4
������������� � ���������� �������� ��� ������� �����, ����������� �������� �������� ������������� (�� ����� 4 ��������).

��������� ������ �������� ������ �����, ������� ������� �� ������� ���� �������� ��������� � ������������ ����� �����.
(����� �������� ������ ���� �� ����� 50% �� ����� �����).
��� ���������� ������� ������ ���� ����������� set � get ������.

//
 */