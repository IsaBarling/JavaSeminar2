package data;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterator<Student> {
    private Teacher teacher;
    private List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
