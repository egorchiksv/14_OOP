package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private int number;
    public List<StudentGroup> studentGroups = new ArrayList<>();

    public void addGroup(int numFlyt, StudentGroup group) {
        studentGroups.add(group);
        number = numFlyt;
    }
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    @Override
    public String toString() {
        return "Поток №" +
                number + ": {"
                + studentGroups +
                '}';
    }
}
