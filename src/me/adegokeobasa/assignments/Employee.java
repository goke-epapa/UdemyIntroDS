package me.adegokeobasa.assignments;

import java.util.Comparator;

/**
 * Created by epapa on 25/10/2015.
 */
public class Employee implements Comparable {
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private String emailId;

    public Employee(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public int compareTo(Object o) {
        if(o == null) {
            return -1;
        }
        return this.employeeNumber - ((Employee) o).getEmployeeNumber();
    }

    @Override
    public String toString() {
        return "This Employee's number is : " + employeeNumber + "\n";
    }
}
