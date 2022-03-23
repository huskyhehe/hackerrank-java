/*******************************************************************
 * The singleton pattern is a design pattern that 
 * restricts the instantiation of a class to one object. 
 * This is useful when exactly one object is needed to 
 * coordinate actions across the system.
 *******************************************************************/

class Singleton {
	
    public String str;

    // A private Singleton non parameterized constructor
    private Singleton() {}; 

    private static Singleton _instance;
    
	// a static method that returns the single instance of the Singleton class
    public static Singleton getSingleInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}