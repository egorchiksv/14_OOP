/*
Задача 1 - Iterator
📌 Создать класс Студент
📌 Создать класс УчебнаяГруппа
📌 Создать класс УчебнаяГруппаИтератор, заставив его реализовать
интерфейс Iterator
📌 Реализовать его контракты (включая удаление)

Задача 2 - Iterable
📌 Модифицировать класс УчебнаяГруппа, заставив его реализовать
интерфейс Iterable
📌 Реализовать метод iterator() возвращающий экземпляр созданного нами
итератора
📌 Создать класс УчебнаяГруппаСервис, добавив в него метод удаления
студента по ФИО
📌 Создать класс Контроллер, добавив в него метод удаления студента и
вызывать в нем созданный метод из УчебнаяГруппаСервис

Задача 3 - Comparable
📌 Модифицировать класс Студент, заставив его реализовать интерфейс
Comparable
📌 Реализовать контракт compareTo () со сравнением по какому-либо
параметру (пример studentId)
📌 Модифицировать класс УчебнаяГруппаСервис, добавив в него метод
сортировки списка студентов по id
📌 Модифицировать класс Контроллер, добавив в него метод сортировки
списка студентов по id и вызывать в нем созданный метод из
УчебнаяГруппаСервис
 */
package Task1;

import java.util.*;

public class IteratorMain {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        StudentGroup studentGroup3 = new StudentGroup();
        StudentGroup studentGroup4 = new StudentGroup();
        StudentGroup studentGroup5 = new StudentGroup();
        StudentGroup studentGroup6 = new StudentGroup();
        Stream studentStream1 = new Stream();
        Stream studentStream2 = new Stream();
        Stream studentStream3 = new Stream();

        Student van = new Student("van", 4);
        Student igor = new Student("Igorechick",1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup1.addStudent(111, van);
        studentGroup1.addStudent(111, igor);
        studentGroup1.addStudent(111, alex);
        studentGroup1.addStudent(111, alexey);
        studentGroup2.addStudent(112, van);
        studentGroup2.addStudent(112, alexey);
        studentGroup2.addStudent(112, igor);
        studentGroup3.addStudent(113, van);
        studentGroup3.addStudent(113, van);
        studentGroup4.addStudent(114, van);
        studentGroup4.addStudent(114, igor);
        studentGroup4.addStudent(114, alexey);
        studentGroup4.addStudent(114, alexey);
        studentGroup4.addStudent(114, igor);
        studentGroup5.addStudent(115, alex);
        studentGroup6.addStudent(116, igor);
        studentGroup6.addStudent(116, van);

        studentStream1.addGroup(1, studentGroup1);
        studentStream1.addGroup(1, studentGroup5);
        studentStream2.addGroup(2, studentGroup2);
        studentStream3.addGroup(3, studentGroup3);
        studentStream3.addGroup(3, studentGroup4);
        studentStream3.addGroup(3, studentGroup6);



        ArrayList<StudentGroup> arrayListGroup1 = new ArrayList<>(List.of(studentGroup1));
        System.out.println(arrayListGroup1);
        ArrayList<StudentGroup> arrayListGroup2 = new ArrayList<>(List.of(studentGroup2));
        System.out.println(arrayListGroup2);
        ArrayList<StudentGroup> arrayListGroup3 = new ArrayList<>(List.of(studentGroup3));
        System.out.println(arrayListGroup3);
        ArrayList<StudentGroup> arrayListGroup4 = new ArrayList<>(List.of(studentGroup4));
        System.out.println(arrayListGroup4);
        ArrayList<StudentGroup> arrayListGroup5 = new ArrayList<>(List.of(studentGroup5));
        System.out.println(arrayListGroup5);
        ArrayList<StudentGroup> arrayListGroup6 = new ArrayList<>(List.of(studentGroup6));
        System.out.println(arrayListGroup6);
        System.out.println("***************************************************************");

        ArrayList<Stream> arrayListStream1 = new ArrayList<>(List.of(studentStream1));
        System.out.println(arrayListStream1);
        ArrayList<Stream> arrayListStream2 = new ArrayList<>(List.of(studentStream2));
        System.out.println(arrayListStream2);
        ArrayList<Stream> arrayListStream3 = new ArrayList<>(List.of(studentStream3));
        System.out.println(arrayListStream3);
        System.out.println("***************************************************************");
        ArrayList<Stream> streams = new ArrayList<>(List.of(studentStream1, studentStream2, studentStream3));
        System.out.println(streams);
        System.out.println("***************************************************************");
        Collections.sort(streams, new StreamComparator());
        System.out.println(streams);
        System.out.println("***************************************************************");
        ArrayList<ArrayList<FlytService>> sortStream = new ArrayList<>(streams);
        Collections.sort(sortStream, new StreamComparator());
        System.out.println(sortStream);



//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));
//        System.out.println(arrayList);
//        Collections.sort(arrayList);// можно мегять местами o.name.length() - this.name.length() в методе и ли приметить reversOrder
//        Collections.sort(arrayList, Comparator.reverseOrder());
//        Collections.sort(arrayList, new StudentComparator());
        /*
        public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
        }
         */
//        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // тоже самое, что в предудущих методах сортировки, но через лямбда
        /*Collections.sort(arrayList, (s1, s2) -> {return s1.id - s2.id;});// тоже самое*/

//        System.out.println(arrayList);
//
//        for (Student student: studentGroup1) {
//            System.out.println(student);
//        }

    }
}
