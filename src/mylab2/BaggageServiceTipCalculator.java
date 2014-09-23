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
    private double minBill = 0.00;
    private double goodRate = 0.20;
    private double fairRate = 0.15;
    private double poorRate = 0.10;
    private double maxBill = 100.00;
    private String billEntryError =
            "Error: bill must be between " + minBill + " and "
            + maxBill;
    private double baseTipPerBag = 1.00;
    private double tip;

    public BaggageServiceTipCalculator(ServiceQuality quality, double bagCount) {
        setTip(quality, bagCount);
    }

    public void setTip(ServiceQuality quality, double bagCount) {
        if (bagCount <= 0){
            throw new IllegalArgumentException (
            "error: back count must be more than zero");
        }
        else if ((bagCount * baseTipPerBag) > maxBill || (bagCount * baseTipPerBag) < minBill ){
            System.out.println(billEntryError);
        }
        if (quality == null){
            throw new IllegalArgumentException (
            "error: Service Quality measure must be set");
        }
        switch(quality) {
            case GOOD:
                tip = baseTipPerBag * bagCount * (1 + goodRate);
                break;
            case FAIR:
                tip = baseTipPerBag * bagCount * (1 + fairRate);
                break;
            case POOR:
                tip = baseTipPerBag * bagCount * (1 + poorRate);
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }
    
    // Getters and setters for baseTipPerBag.  Added incase the base amount needs to change
    
    private double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    private void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

    private double getMinBill() {
        return minBill;
    }

    private void setMinBill(double minBill) {
        if(minBill < 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.minBill = minBill;
    }

    private double getGoodRate() {
        return goodRate;
    }

    private void setGoodRate(double goodRate) {
        if(goodRate < 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }    
        this.goodRate = goodRate;
    }

    private double getFairRate() {
        return fairRate;
    }

    private void setFairRate(double fairRate) {
        if(fairRate < 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.fairRate = fairRate;
    }

    private double getPoorRate() {
        return poorRate;
    }

    private void setPoorRate(double poorRate) {
        if(poorRate < 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.poorRate = poorRate;
    }

    private double getMaxBill() {
        return maxBill;
    }

    private void setMaxBill(double maxBill) {
        if(maxBill < 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.maxBill = maxBill;
    }

    private String getBillEntryError() {
        return billEntryError;
    }

    private void setBillEntryError(String billEntryError) {
        if (billEntryError == null || billEntryError.length() == 0){
            throw new IllegalArgumentException(
                    "error: minBill must be greater than zero");
        }
        this.billEntryError = billEntryError;
    }
    
    
}
