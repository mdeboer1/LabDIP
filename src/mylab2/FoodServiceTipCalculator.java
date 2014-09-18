/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mylab2;

/**
 *
 * @author mdeboer1
 */
public class FoodServiceTipCalculator implements TipCalculator{
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be greater than or equal to " + MIN_BILL;
    private double tip;

    public FoodServiceTipCalculator() {
        
    }

    @Override
    public void setTip(ServiceQuality quality, double billAmount) {
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
