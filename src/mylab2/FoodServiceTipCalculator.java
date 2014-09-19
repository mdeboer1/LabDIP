/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mylab2;

/**
 *
 * @author mdeboer1
 * 
 * This class implements TipCalculator.  It receives information passed from
 * the TipManager class, calculates the tip using the ServiceQuality enumerated
 * types, and returns the tip amount to the Manager.  No getters and setters are
 * provided because tip property is calculated in the setTip method and the other
 * property is final.
 * 
 * Values for ServiceQuality and billAmount are intentionally not store in this 
 * class.  This is a class to calculate a tip, not a class that is to record information
 * for later retrieval.  
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than " + MIN_BILL;
    private double tip;

    public FoodServiceTipCalculator() {
        
    }

    @Override
    public void setTip(ServiceQuality quality, double billAmount) {
        // Validation for arguments.  Bill amount is purposefully tested against
        // 0.01 to eliminate zero or negative amount bills.
        if (billAmount < 0.01){
            System.out.println(BILL_ENTRY_ERR);
        }
        else if (quality == null){
            throw new IllegalArgumentException (
            "error: Service Quality measure must be set");
        }
        switch(quality) {
            case GOOD:
                tip = billAmount * GOOD_RATE;
                break;
            case FAIR:
                tip = billAmount * FAIR_RATE;
                break;
            case POOR:
                tip = billAmount * POOR_RATE;
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }
}
