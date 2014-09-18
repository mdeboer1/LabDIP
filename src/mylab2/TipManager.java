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
public class TipManager {
    private TipCalculator tip;
    
    public TipManager(TipCalculator tip){
        this.tip = tip;
    }
    
    public double setFoodTip(ServiceQuality quality, double billAmount){
        
        tip.setTip(quality, billAmount);
        return tip.getTip();
    }
    
    public double setBaggageTip(ServiceQuality quality, double bagCount){
        
        tip.setTip(quality, bagCount);
        return tip.getTip();
    }
    
}
