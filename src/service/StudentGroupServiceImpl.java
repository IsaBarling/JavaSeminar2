package service;

import data.Student;
import data.StudentGroup;
import data.User;

public class StudentGroupServiceImpl  {


    public void write(StudentGroup studentGroup) {

    }


    public User read(StudentGroup studentGroup) {
        return null;
    }
    
    public void deleteStByName(StudentGroup studentGroup, String name){
        studentGroup.remove();
        var studentList = studentGroup.getStudentList();
        for (Student student: studentList){
            if (student.getName() == name){
                studentList.remove(student);

        }
        }
    }
}
