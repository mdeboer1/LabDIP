/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author mdeboer1
 * This is the concrete class that implements the Employee interface.  All properties
 * are instantiated in the constructor.  No other getters and setters provided as
 * they would not be accessible to other parts of the project as it stands now.
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyWage, hoursWorked;
    
    public HourlyEmployee(double hourlyWage, double hoursWorked){
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double getAnnualPay() {
        return hourlyWage * hoursWorked;
    }
    
}
