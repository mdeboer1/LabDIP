/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author mdeboer1
 * This is the concrete class that implements the Employee interface.   All properties
 * are instantiated in the setAnnualPay method, called from the constructor.
 */
public class HourlyEmployee implements Employee {
    
    private double hourlyWage, annualHoursWorked;
    private WageType hourly;
    
    public HourlyEmployee(double hourlyWage, double annualHoursWorked, WageType hourly){
        setAnnualPay(hourlyWage, annualHoursWorked, hourly);
    }
    
    @Override
    public double getAnnualPay() {
        return hourlyWage * annualHoursWorked;
    }
    
    private void setAnnualPay(double hourlyWage, double annualHoursWorked, WageType hourly){
        //this if statement would be modified to reflect minimum wage
        if(hourly == null || hourlyWage < 1 || annualHoursWorked < 1) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.hourlyWage = hourlyWage;
        this.annualHoursWorked = annualHoursWorked;
        this.hourly = hourly;
    }

    private double getHourlyWage() {
        return hourlyWage;
    }

    private void setHourlyWage(double hourlyWage) {
        if(hourlyWage < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.hourlyWage = hourlyWage;
    }

    private double getAnnualHoursWorked() {
        return annualHoursWorked;
    }

    private void setAnnualHoursWorked(double annualHoursWorked) {
        if(annualHoursWorked < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.annualHoursWorked = annualHoursWorked;
    }
    // no setter provided for setWorkerType as it is an enum and can't change
    private WageType getWageType() {
        return hourly;
    }
    
    
    
}
