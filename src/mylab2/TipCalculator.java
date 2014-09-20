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
 * This is the interface that operates as the abstract layer in the DIP.  It has
 * final properties that inheriting classes need, has a setTip and getTip method
 * that needs to be overridden in any implementing class.
 * 
 */
public interface TipCalculator {
    public static final double MIN_BILL = 0.00;
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    /** @param someTipVariable is used to hold either billAmount or bagCount dependent on
    *what class it is implemented in
    * @param quality is the enum type passed to determine the level of service
    * quality received
    */ 
    public abstract void setTip(ServiceQuality quality, double someTipVariable);
    public abstract double getTip();
    
    
}
