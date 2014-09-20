/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author meboer1
 * This is the Startup class to test the functionality of the project.
 */
public class Startup {
    public static void main(String[] args) {
        
    Employee emp1 = new HourlyEmployee(10.00, 1500);
    Employee emp2 = new SalariedEmployee(65000.00, 10000.00);
    
    HRService hr1 = new HRService(emp1);
    HRService hr2 = new HRService(emp2);
    
    System.out.println(hr1.getAnnualPay());
    System.out.println(hr2.getAnnualPay());
    
    }
}
