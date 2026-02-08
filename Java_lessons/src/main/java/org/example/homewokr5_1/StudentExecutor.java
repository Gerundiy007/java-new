package org.example.homewokr5_1;

public class StudentExecutor {
    public static void main(String[] args) {
        Student studentcf = new StudentChemistryFaculty("Вася","Химия",3,4.5);
        System.out.println(studentcf.getName() + " " + studentcf.getSubject() + " " + studentcf.getCourse());
        Student studentmf = new StudentMathFaculty("Егор","Геометрия",4,3.2);
        System.out.println(studentmf.getName() + " " + studentmf.getSubject() + " " + studentmf.getCourse());
        Student studentpf = new StudentPhysicsFaculty("Игорь","Физика",1,5.0);
        System.out.println(studentpf.getName() + " " + studentpf.getSubject() + " " + studentpf.getCourse());
        Student studenthf = new StudentHistoryFaculty("Петя","История",2,3.1);
        System.out.println(studenthf.getName() + " " +  studenthf.getSubject() + " " + studenthf.getCourse());
    }
}
