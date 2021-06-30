package Hrm;

import java.util.ArrayList;
import java.util.List;

public class Hrm {
    List<Employee> employees = new ArrayList<>();


       public void addEmployee(Employee person){
           employees.add(person);
       }
       public void removeEmployee(int n){
            employees.remove(employees.get(n-1));
       }

       public void Display(){
           for(Employee n: employees){
               System.out.println(n);
           }
       }


}
