package Task1;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentStream implements Iterable<StudentGroup> {

    public StringBuilder streams = new StringBuilder();

    public void addStudent(StudentGroup group) {
        streams.append(group).append(" ");
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(this);
    }
}
