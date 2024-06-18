/*
класс УчебнаяГруппа
 */
package Task1;

import java.util.Iterator;

public class StudentGroup implements Iterable<Student> {
    private int number;
    public StringBuilder students = new StringBuilder();

    public void addStudent(int numGroup, Student student) {
        students.append(student).append(" ");
        number = numGroup;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "Группа №" +
                number +
                ": {" +
                students +
                '}';
    }
}
