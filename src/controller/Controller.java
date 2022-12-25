package controller;

import data.Student;
import data.StudentGroup;
import service.DataService;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

public class Controller {

    private DataService studentService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student){
        studentService.write(student);
        studentService.read(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupNumber){
        return null;
    }

    public void deleteStudent(StudentGroup studentGroup, String name){
        ((StudentGroupServiceImpl) studentService).deleteStByName(studentGroup , name);
    }



}
