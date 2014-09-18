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
public class Startup {
    
    public static void main(String[] args) {
        
        ServiceQuality good = ServiceQuality.GOOD;
        ServiceQuality fair = ServiceQuality.FAIR;
        ServiceQuality poor = ServiceQuality.POOR;

        
        TipCalculator tip1 = new FoodServiceTipCalculator();
        TipCalculator tip2 = new BaggageServiceTipCalculator();
        
        TipManager manager1 = new TipManager(tip1);
        TipManager manager2 = new TipManager(tip2);
        
//        manager1.setFoodTip(good, 100.00);
//        manager2.setBaggageTip(fair, 4);
        System.out.println(manager1.setFoodTip(good, 100.00));
        System.out.println(manager2.setBaggageTip(fair, 4));
    }
    
    
}
