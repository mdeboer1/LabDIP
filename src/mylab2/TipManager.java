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
 * This classes manages the tip calculation operations.  It has methods to set the
 * tip information from the requisite tip class.
 * 
 */
public class TipManager {
    private TipCalculator tip;
    
    public TipManager(TipCalculator tip){
        this.tip = tip;
    }
    
   public double getCalculatedTip(){
       return tip.getTip();
   }

    public TipCalculator getTip() {
        return tip;
    }

    public void setTip(TipCalculator tip) {
        if (tip == null){
            throw new IllegalArgumentException(
                    "error: this object has  not been instantiated");
        }
        this.tip = tip;
    }
   
   
}
