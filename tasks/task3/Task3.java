package task3;

import java.util.*;

public class Task3 {

    public static void method(String string){
        List<String> list = Arrays.asList(string.split("\\s+"));//���������� ������ �� ���������� �������� (1 ��� ������)
        list.sort(new Comparator<String>() {//���������� ������ �� ����� �����
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        System.out.println(list.size());
        for(String s : list){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        method("qwe sdkfhd 234ewfusdfn sdf ; hpidsuf    ;sdhif;sd   sdfoids fsd       s[doidfd    ");
    }
}
/*
Task3
������ ������� �� ����, ����������� ����� ��� ����������� ���������. ����������� ����� �� �������� �� ����.

//
 */