package iterators;

import data.Student;

import java.util.Iterator;

public class StudentGroupIterator implements Iterator<Student> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
