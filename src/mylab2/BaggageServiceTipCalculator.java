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
 * types, and returns the tip amount to the Manager.  It also offers public getters
 * and setters incase the baseTipPerBag amount needs to change.  No other getters 
 * and setters were made available, because tip is calculated in the setTip method
 * and all other properties (except baseTipPerBag (see above)) are final.
 * 
 * Values for ServiceQuality and bagCount are intentionally not store in this 
 * class.  This is a class to calculate a tip, not a class that is to record information
 * for later retrieval.  
 */
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private double baseTipPerBag = 1.00;
    private double tip;

    public BaggageServiceTipCalculator() {
        
    }

    @Override
    public void setTip(ServiceQuality quality, double bagCount) {
        
        switch(quality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + POOR_RATE);
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }
    
    // Getters and setters for baseTipPerBag.  Added incase the base amount needs to change
    
    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }
}
