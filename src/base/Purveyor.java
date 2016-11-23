package base;

/**
 * 
 * @author mt
 * </b>Purveyor</b> is immutable it is used to store the characteristics
 * of a purveyor
 * 
 */
public class Purveyor {
    
    // Rep Invariant: 
    //  name, email != null
    
    // Abstraction Function:
    //  this.name = name
    //  this.email = email
    
    private String name;
    private String email;
    
    /**
     * Constructs a new Purveyor
     * 
     * @effects creates a new Purveyor with name = name and 
     * email = email
     * @param name the name of the Purveyor
     * @param email the email of the Purveyor
     */
    public Purveyor(String name, String email) {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Returns the name of this Purveyor
     * 
     * @return a String that is the name of this
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Returns the email of this Purveyor
     * 
     * @return a String that is the email of this
     */
    public String getEmail() {
        throw new UnsupportedOperationException();
    }
    
    /**
     * Verifies that the representation invariant has not been
     * violated
     */
    private void checkRep() {
        throw new UnsupportedOperationException();
    }
}
