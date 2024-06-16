package Task1;

import java.util.Iterator;

public class StudentStreamIterator implements Iterator<StudentGroup> {

    private StudentStream studentStream;
    private int index = 0;

    public StudentStreamIterator(StudentStream stream) {
        this.studentStream = stream;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentGroup next() {
        return null;
    }
}
