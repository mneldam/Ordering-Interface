package base;

import java.util.*;

/**
 * 
 * @author mt
 * </b>FoodItem</b> is mutable it is used to store characteristics of a 
 * a food item. 
 * 
 */
public class FoodItem {
    
    // Rep invariant: name and purveyor cannot be null
    
    // Abstraction Function: 
    //  this.name = name of a food product
    //  this.purveyors = a list of purveyors which sell 
    //  the food product
    
    private String name;
    private List<Purveyor> purveyors;
    
    /**
     * Creates a new FoodItem with a name and no purveyors
     * 
     * @effects creates a new FoodItem with name = name
     * @param name the name of the FoodItem
     */
    public FoodItem(String name) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Creates a new FoodItem with a name and a collection
     * of Purveyors
     * 
     * @param name the name of the FoodItem
     * @param purveyors a list of purveyors which sell the given
     * food product 
     */
    public FoodItem(String name, List<Purveyor> purveyors) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Gets the name of this FoodItem
     * 
     * @return a string which is the name of this FoodItem
     */
    public String getName() {
        throw new UnsupportedOperationException();    
    }
    
    /**
     * Gets the list of the purveyors
     * 
     * @return a list of Purveyor which are all of the Purveyor
     * which sell this FoodItem
     */
    public List<Purveyor> getPurveyor() {
        throw new UnsupportedOperationException();   
    }
    
    /**
     * checks to ensure that the rep invariant has not been violated
     */
    private void checkRep() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Adds a Purveyor which sells this FoodItem
     * 
     * @param add the Purveyor to be added to this
     */
    public void addPurveyor(Purveyor add) {
        throw new UnsupportedOperationException();
    }
}
