package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Teacher Virat = new Teacher(1,"Virat",500);
        Teacher Mayank = new Teacher(2,"Mayank",700);
        Teacher Ishita = new Teacher(3,"Ishita",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Virat);
        teacherList.add(Mayank);
        teacherList.add(Ishita);


        Student Saloni = new Student(1,"Saloni",4);
        Student Aryan = new Student(2,"Aryan",12);
        Student Khushi = new Student(3,"Khushi",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Saloni);
        studentList.add(Aryan);
        studentList.add(Khushi);




        School ghs = new School(teacherList,studentList);

        Teacher Pam = new Teacher(6,"Pam", 900);

        ghs.addTeacher(Pam);


        Saloni.payFees(5000);
        Aryan.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Virat.receiveSalary(Virat.getSalary());
        System.out.println("GHS has spent for salary to " + Virat.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        Ishita.receiveSalary(Ishita.getSalary());
        System.out.println("GHS has spent for salary to " + Ishita.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Aryan);

        Mayank.receiveSalary(Mayank.getSalary());

        System.out.println(Mayank);


    }
}