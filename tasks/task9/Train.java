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
—оздайте структуру с именем train, содержащую пол€: название пункта назначени€, номер поезда, врем€ отправлени€. ¬вести данные в массив из п€ти элементов типа train,
упор€дочить элементы по номерам поездов. ƒобавить возможность вывода информации о поезде, номер которого введен пользователем.
ƒобавить возможность сортировки массив по пункту назначени€, причем поезда с одинаковыми пунктами назначени€ должны быть упор€дочены по времени отправлени€.

//
 */