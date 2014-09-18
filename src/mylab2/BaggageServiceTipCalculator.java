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
public class BaggageServiceTipCalculator implements TipCalculator {
    private static final double MAX_BILL = 100.00;
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static final double BASE_TIP_PER_BAG = 1.00;
//    private double bagCount;
//    private String quality;
    private double tip;

    public BaggageServiceTipCalculator() {
        
    }

    @Override
    public void setTip(ServiceQuality quality, double bagCount) {
//        this.quality = quality.name();
//        this.bagCount = bagCount;
        
        switch(quality) {
            case GOOD:
                tip = BASE_TIP_PER_BAG * bagCount * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = BASE_TIP_PER_BAG * bagCount * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = BASE_TIP_PER_BAG * bagCount * (1 + POOR_RATE);
                break;
        }
    }

    @Override
    public double getTip() {
        return tip;
    }
    
    
}
