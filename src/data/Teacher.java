package data;

import java.util.List;

public class Teacher extends User{

    private String faculty;
    public Teacher(String name, int age, int passport, String faculty) {
        super(name, age, passport);
        this.faculty = faculty;
    }

    @Override
    public void write(String path) {

    }

    @Override
    public void read(String path) {

    }


}
