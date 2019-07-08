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
Создайте структуру с именем train, содержащую поля: название пункта назначения, номер поезда, время отправления. Ввести данные в массив из пяти элементов типа train,
упорядочить элементы по номерам поездов. Добавить возможность вывода информации о поезде, номер которого введен пользователем.
Добавить возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

//
 */