package Hrm;

import Hrm.Resume.Resume;

public class Employee {
    private String name;
    private int id;
    private int salary;
    private Gender gender;
    private String city;
    private Resume resume;
    private Department department;

    public Employee(String name, int id, int salary, Gender gender, String city, Resume resume,Department department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.gender = gender;
        this.city = city;
        this.resume = resume;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public Gender getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", resume=" + resume +
                '}';
    }
}
