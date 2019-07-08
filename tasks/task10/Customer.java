package task10;

import java.util.Objects;

public class Customer implements Comparable{

    private String lastname;
    private String firstname;
    private String midlename;
    private String address;
    private int numcard;
    private int numaccount;

    public Customer(String lastname, String firstname, String midlename, String address, int numcard, int numaccount) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.midlename = midlename;
        this.address = address;
        this.numcard = numcard;
        this.numaccount = numaccount;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidlename() {
        return midlename;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumcard() {
        return numcard;
    }

    public void setNumcard(int numcard) {
        this.numcard = numcard;
    }

    public int getNumaccount() {
        return numaccount;
    }

    public void setNumaccount(int numaccount) {
        this.numaccount = numaccount;
    }

    @Override
    public String toString() {
        return String.format("Покупатель: %s %s %s\nАдрес - %s\nНомер банковской карты: %d\nНомер банковского счета: %d", getLastname(), getFirstname(), getMidlename(), getAddress(), getNumcard(), getNumaccount());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return numcard == customer.numcard &&
                numaccount == customer.numaccount &&
                lastname.equals(customer.lastname) &&
                firstname.equals(customer.firstname) &&
                Objects.equals(midlename, customer.midlename) &&
                address.equals(customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, midlename, address, numcard, numaccount);
    }

    @Override
    public int compareTo(Object o) {
        Customer cust = (Customer) o;
        if(this.getLastname().compareTo(cust.getLastname())!=0) return this.getLastname().compareTo(cust.getLastname());
        else if(this.getFirstname().compareTo(cust.getFirstname())!=0) return this.getFirstname().compareTo(cust.getFirstname());
        else if(this.getMidlename().compareTo(cust.getMidlename())!=0) return this.getMidlename().compareTo(cust.getMidlename());
        else if (this.getAddress().compareTo(cust.getAddress())!=0) return this.getAddress().compareTo(cust.getAddress());
        else return this.getNumaccount()-cust.getNumaccount();

    }
}
/*
Task10
Класс Покупатель: Фамилия, Имя, Отчество, Адрес, Номер кредитной карточки, Номер банковского счета; Конструктор; Методы: установка значений атрибутов,
получение значений атрибутов, вывод информации. Создать массив объектов данного класса.
Вывести список покупателей в алфавитном порядке и список покупателей, у которых номер кредитной карточки находится в заданном диапазоне.*/
