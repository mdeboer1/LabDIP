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
    private double minBill = 0.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private String billEntryError =
            "Error: bill must be greater than " + minBill;
    private double tip;

    public FoodServiceTipCalculator(ServiceQuality quality, double billAmount) {
        setTip(quality, billAmount);
    }


    private void setTip(ServiceQuality quality, double billAmount) {
        // Validation for arguments.  Bill amount is purposefully tested against
        // 0.01 to eliminate zero or negative amount bills.
        if (billAmount < 0.01){
            System.out.println(billEntryError);
        }
        else if (quality == null){
            throw new IllegalArgumentException (
            "error: Service Quality measure must be set");
        }
        switch(quality) {
            case GOOD:
                tip = billAmount * goodRate;
                break;
            case FAIR:
                tip = billAmount * fairRate;
                break;
            case POOR:
                tip = billAmount * poorRate;
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }

    private double getMinBill() {
        return minBill;
    }

    private void setMinBill(double minBill) {
        if(minBill < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.minBill = minBill;
    }

    private double getGoodRate() {
        return goodRate;
    }

    private void setGoodRate(double goodRate) {
        if(goodRate < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.goodRate = goodRate;
    }

    private double getFairRate() {
        return fairRate;
    }

    private void setFairRate(double fairRate) {
        if(fairRate < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.fairRate = fairRate;
    }

    private double getPoorRate() {
        return poorRate;
    }

    private void setPoorRate(double poorRate) {
        if(poorRate < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.poorRate = poorRate;
    }

    private String getBillEntryFee() {
        return billEntryError;
    }

    private void setBillEntryFee(String billEntryError) {
        if (billEntryError == null || billEntryError.length() == 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.billEntryError = billEntryError;
    }
    
    
}
