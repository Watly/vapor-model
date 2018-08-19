/**
 * This work is licensed under the 
 * Creative Commons Attribution-ShareAlike 4.0 International License. 
 * To view a copy of this license, visit 
 * http://creativecommons.org/licenses/by-sa/4.0/ 
 * or send a letter to 
 * Creative Commons, 
 * PO Box 1866, Mountain View, 
 * CA 94042, USA.
 */
package co.watly.vapor.model;

/**
 * It represents all the info useful to the Vapor Framework to extract DSL Sentences
 * @author Marco Vasapollo
 * 
 * Speed must be in cm/s
 * Weight must be in hg
 * Distances must in cm
 *
 */
public interface IDroneData {
    
    long getMaxReachableSpeed();
    
    long getMaxWeightCapability();
    
    double getSpeedDecreasingFactor();
    
    long getTotalJourney();
    
    String getModelName();
}
