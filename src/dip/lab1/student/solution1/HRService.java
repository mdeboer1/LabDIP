/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author mdeboer1
 * This is the manager for this DIP example.  It takes the Employee object, sets
 * it to a private Employee object, then calls the proper getAnnualPay method.
 */
public class HRService {
    private Employee employee;
    
    public HRService(Employee employee){
        this.employee = employee;
    }
    
    public double getAnnualPay(){
        return employee.getAnnualPay();
    }
}
