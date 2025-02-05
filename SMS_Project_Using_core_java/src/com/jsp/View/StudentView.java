package com.jsp.View;

import java.util.Scanner;
import com.jsp.Model.Student;
import com.jsp.Controller.StudentController;

public class StudentView {

    private static Scanner sc = new Scanner(System.in);
    private static StudentController controller = new StudentController();

    public static Student getStudentObject() {
        Student s = new Student();

        System.out.println("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Email:");
        String email = sc.nextLine();

        System.out.println("Enter Password:");
        String password = sc.nextLine();

        System.out.println("Enter Dob:");
        String dob = sc.nextLine();

        System.out.println("Enter Gender:");
        String gender = sc.nextLine();

        System.out.println("Enter Relationship Status:");
        String relationShipStatus = sc.nextLine();

        System.out.println("Enter Mobile Number:");
        long mob = sc.nextLong();

        // Setting values into the Student object
        s.setId(id);
        s.setName(name);
        s.setEmail(email);
        s.setPassword(password);
        s.setDob(dob);
        s.setGender(gender);
        s.setRelationShipStatus(relationShipStatus);
        s.setMob(mob);

        return s; // Return the student object
    }

    public static void main(String[] args) {
        System.out.println("******** Welcome to SMS PROJECT ********\n");
        System.out.println("1. Create Student");
        System.out.println("2. Find Student by ID");
        System.out.println("3. Update Student by ID");
        System.out.println("4. Delete Student By ID");
        System.out.println("5. Find All Students");
        System.out.println("6. EXIT");

        while (true) {
            System.out.println("\nEnter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Logic to create a Student object
                    Student newStudent = getStudentObject();
                    controller.saveStudent(newStudent);
                    System.out.println("Student Created Successfully!");
                    break;

                case 2:
                    // Find student by ID
                    System.out.println("Enter Id to Search:");
                    int searchId = sc.nextInt();
                    controller.findById(searchId);
                    break;

                case 3:
                	// Update student by ID
                    System.out.println("Enter ID of the Student to Update:");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // Consume leftover newline
                    System.out.println("Enter New Details for the Student:");
                    Student updatedStudent = getStudentObject();
                    boolean isUpdated = controller.updateById(updateId, updatedStudent);
                    if (isUpdated) {
                        System.out.println("Student Updated Successfully!");
                    } else {
                        System.out.println("Student with ID " + updateId + " not found.");
                    }
                    break;

                case 4:
                	// Delete student by ID
                    System.out.println("Enter ID of the Student to Delete:");
                    int deleteId = sc.nextInt();
                    boolean isDeleted = controller.deleteStudent(deleteId);
                    if (isDeleted) {
                        System.out.println("Student Deleted Successfully!");
                    } else {
                        System.out.println("Student with ID " + deleteId + " not found.");
                    }
                    break;

                case 5:
                    // Find All Students
                    System.out.println("List of All Students:");
                    controller.findAll();
                    break;

                case 6:
                    System.out.println("***** THANK YOU *****");
                    return;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }
        }
    }
}
