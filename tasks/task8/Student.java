package task8;

public class Student {

    private String name;
    private String group;
    private int[] gr = new int[5];

    public Student(String name, String group, int[] gr) {
        this.name = name;
        this.group = group;
        this.gr = gr;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int[] getGr() {
        return gr;
    }
    public double getAvg(){
        double res = 0;
        for(int x : getGr()) res+=x;
        return res/5;
    }
}
/*
Task8
�������� ����� student, ���������� ����: ������� � ��������, ����� ������, ������������ (������ �� ���� ���������).
������� ������ �� ������ ��������� ������ ����, ����������� ������ �� ����������� �������� �����.
�������� ����������� ������ ������� � ������� ����� ���������, ������� ������, ������ ������ 4 ��� 5.

//
 */