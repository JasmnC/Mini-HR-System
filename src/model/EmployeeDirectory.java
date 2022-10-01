/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yuujadz
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeDirectory;
    
    
    public EmployeeDirectory(){
        this.employeeDirectory = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(ArrayList<Employee> employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        employeeDirectory.add(newEmployee);
        return newEmployee;
    }
    
    public void delete(Employee e){
        employeeDirectory.remove(e);
    }

}
