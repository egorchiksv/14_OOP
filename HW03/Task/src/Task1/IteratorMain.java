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
        StudentGroup studentGroup = new StudentGroup();

        Student van = new Student("van", 4);
        Student igor = new Student("Igorechick",1);
        Student alex = new Student("Alex", 2);
        Student alexey = new Student("Alexey", 3);

        studentGroup.addStudent(van);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);

//        Iterator<Student> iterator = new StudentGroupIterator(studentGroup);
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
        ArrayList<Student> arrayList = new ArrayList<>(List.of(van, igor, alex, alexey));
        System.out.println(arrayList);
//        Collections.sort(arrayList);// можно мегять местами o.name.length() - this.name.length() в методе и ли приметить reversOrder
//        Collections.sort(arrayList, Comparator.reverseOrder());
//        Collections.sort(arrayList, new StudentComparator());
        /*
        public int compare(Student o1, Student o2) {
        return o1.id - o2.id;
        }
         */
        Collections.sort(arrayList, (s1, s2) -> s1.id - s2.id); // тоже самое, что в предудущих методах сортировки, но через лямбда
        /*Collections.sort(arrayList, (s1, s2) -> {return s1.id - s2.id;});// тоже самое*/

        System.out.println(arrayList);

        for (Student student: studentGroup) {
            System.out.println(student);
        }

    }
}
