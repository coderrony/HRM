package Hrm;

import Hrm.Resume.Certificate;
import Hrm.Resume.Resume;
import Hrm.Resume.Skrill;

public class Main {
    public static void main(String[] args) {
        Hrm hrm = new Hrm();
        Employee employee = new Employee("",1,3000,Gender.MALE,
                "chittagong",new Resume(Certificate.BBA,Skrill.SCO_EXPERT),
                Department.JUNIOR_DEVELOPER);
        Employee employee2 = new Employee("ali",2,5000,Gender.MALE,
                "chittagong",new Resume(Certificate.BACHELOR_DEGREE,
                Skrill.SOFTWARE_DEVELOPER),Department.SENIOR_DEVELOPER);
        Employee employee3 = new Employee("Tisha",3,5500,Gender.FEMALE,
                "Dhaka",new Resume(Certificate.MBA,
                Skrill.WEB_DESIGNER),Department.SENIOR_DEVELOPER);

        hrm.addEmployee(employee);
        hrm.addEmployee(employee2);
        hrm.addEmployee(employee3);
       hrm.removeEmployee(1);
        hrm.Display();

    }
}
