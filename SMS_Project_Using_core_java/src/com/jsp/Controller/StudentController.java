package com.jsp.Controller;

import java.util.ArrayList;
import com.jsp.Model.Student;

public class StudentController {

    private ArrayList<Student> al = new ArrayList<>();

    // Save student in ArrayList
    public void saveStudent(Student student) {
        al.add(student);
    }

    // Find all students
    public void findAll() {
        if (al.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : al) {
            System.out.println(s); // Calls toString
        }
    }

    // Find student by ID
    public void findById(int id) {
        for (Student s : al) {
            if (s.getId() == id) {
                System.out.println(s); // Calls toString
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }
    
    //Update Student by Id
    public boolean updateById(int id, Student updatedStudent) {
    	for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId() == id) {
                al.set(i, updatedStudent); // Update the student object
                return true; // Return true if the update was successful
            }
        }
        return false; // Return false if the ID was not found
    }
    
    //Delete student by ID
    public boolean deleteStudent(int id) {
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).getId() == id) {
                al.remove(i); // Remove the student object
                return true; // Return true if deletion was successful
            }
        }
        return false; // Return false if the ID was not found
    }
}

