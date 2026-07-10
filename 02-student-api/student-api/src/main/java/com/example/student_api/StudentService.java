package com.example.student_api;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Aarti", 20, "aarti@gmail.com"));
        students.add(new Student(2, "Priya", 21, "priya@gmail.com"));
        students.add(new Student(3, "Sumiran", 19, "sumi@gmail.com"));
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public boolean updateStudent(int id, Student updatedStudent) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                student.setEmailAddress(updatedStudent.getEmailAddress());

                return true;
            }
        }

        return false;
    }

    public boolean deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                students.remove(student);
                return true;
            }
        }

        return false;
    }
}