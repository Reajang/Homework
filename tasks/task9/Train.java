package task9;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Train {

    private String to;
    private int number;
    private Calendar time;

    public Train(String to, int number, Calendar cal) {
        this.to = to;
        this.number = number;
        this.time = cal;
    }

    public String getTimeFormat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM HH:mm");
        return sdf.format(time.getTime());
    }

    public Calendar getTime() {
        return time;
    }

    public String getTo() {
        return to;
    }

    public int getNumber() {
        return number;
    }
}
/*
Task9
�������� ��������� � ������ train, ���������� ����: �������� ������ ����������, ����� ������, ����� �����������. ������ ������ � ������ �� ���� ��������� ���� train,
����������� �������� �� ������� �������. �������� ����������� ������ ���������� � ������, ����� �������� ������ �������������.
�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � ����������� �������� ���������� ������ ���� ����������� �� ������� �����������.

//
 */