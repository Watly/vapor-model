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

import java.util.concurrent.CompletableFuture;

/**
 * All the basic commands each Drone must implement to be compatible with Vapor Framework.
 * 
 * Each Drone producer simply must implement this as the best way its hardware can manage.
 * 
 * Speeds are cm/sec
 * 
 * @author Marco Vasapollo
 *
 */
public interface IDrone {

    CompletableFuture<IDroneData> getData();
    
    CompletableFuture<Void> rotate(long speed, double dregrees);
    
    CompletableFuture<Void> forward(long speed, long millisecs);
    
    CompletableFuture<Void> back(long speed, long millisecs);
    
    CompletableFuture<Void> up(long speed, long millisecs);
    
    CompletableFuture<Void> down(long speed, long millisecs);
    
    CompletableFuture<Void> left(long speed, long millisecs);
    
    CompletableFuture<Void> right(long speed, long millisecs);
}