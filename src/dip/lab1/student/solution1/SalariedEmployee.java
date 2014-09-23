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
 * are instantiated in the setAnnualPay method, called from the constructor.
 */
public class SalariedEmployee implements Employee {

    private double annualSalary, annualBonus;
    private WageType salaried;
    
    public SalariedEmployee(double annualSalary, double annualBonus, WageType salaried) {
        if(salaried == null || annualSalary <= 0 || annualBonus < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        setAnnualPay(annualSalary, annualBonus, salaried);
    }

    @Override
    public double getAnnualPay() {
        return annualSalary + annualBonus;
    }
    
    private void setAnnualPay(double annualSalary, double annualBonus, WageType salaried){
        this.annualSalary = annualSalary;
        this.annualBonus = annualBonus;
        this.salaried = salaried;
    }
    // no setter provided for setWageType, this is an enum that can't change!
    private WageType getWageType() {
        return salaried;
    }

    private double getAnnualSalary() {
        return annualSalary;
    }

    private void setAnnualSalary(double annualSalary) {
        if(annualSalary < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.annualSalary = annualSalary;
    }

    private double getAnnualBonus() {
        return annualBonus;
    }

    private void setAnnualBonus(double annualBonus) {
        if(annualBonus < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.annualBonus = annualBonus;
    }
    
    
}

