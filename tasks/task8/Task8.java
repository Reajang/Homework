package task8;

import java.util.Arrays;
import java.util.Comparator;

public class Task8 {

    public static void for4or5(Student[] they){

        for(Student s : they){
            int i = 0;
            for(int x : s.getGr()){
                if(x<4) i++;
            }
            if(i == 0) System.out.println(s.getName() + " " + s.getGroup()+" "+Arrays.toString(s.getGr()));
        }
    }

    public static void main(String[] args) {

            Student[] students = new Student[10];
            Student st;
            int[] stg1 = {3, 5, 5, 4, 4};
            st = new Student("A A.A", "G1-14", stg1);
            students[0] = st;
            int[] stg2 = {5, 5, 5, 4, 4};
            st = new Student("B A.A", "G2-14", stg2);
            students[1] = st;
            int[] stg3 = {3, 3, 5,3, 4};
            st = new Student("C A.A", "G1-14", stg3);
            students[2] = st;
            int[] stg4 = {5, 5, 5, 5, 5};
            st = new Student("D A.A", "G3-10", stg4);
            students[3] = st;
            int[] stg5 = {4, 4, 4, 4, 4};
            st = new Student("E A.A", "G3-14", stg5);
            students[4] = st;
            int[] stg6 = {5, 2, 2, 4, 4};
            st = new Student("F A.A", "G2-14", stg6);
            students[5] = st;
            int[] stg7 = {3, 3, 3, 3, 3};
            st = new Student("G A.A", "G5-11", stg7);
            students[6] = st;
            int[] stg8 = {4, 3, 5, 4, 4};
            st = new Student("H A.A", "G9-14", stg8);
            students[7] = st;
            int[] stg9 = {4, 5, 5, 4, 4};
            st = new Student("I A.A", "G1-14", stg9);
            students[8] = st;
            int[] stg10 = {2, 5, 5, 4, 4};
            st = new Student("J A.A", "G2-14", stg10);
            students[9] = st;

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getAvg(), o2.getAvg());
            }
        });
        //Вывод отсортированного массива
        for(Student s : students){
            System.out.println(s.getName() + " " + s.getGroup()+" "+Arrays.toString(s.getGr()) + " "+ s.getAvg());
        }
        //Вывод фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.
        for4or5(students);
    }

}
/*
Task8
Создайте класс student, содержащую поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов).
Создать массив из десяти элементов такого типа, упорядочить записи по возрастанию среднего балла.
Добавить возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 4 или 5.

//
 */