// For an overview of the program and sample inputs, be sure to check out `InteractiveFiction.md`

// Methods and getter/setters for the light status
public class Lamp {
    private boolean isLit = false;

    public void turnOn() {
        isLit = true;
    }

    public boolean isLit() {
        return isLit;
    }
    
    public boolean getIsLit() {
    	return isLit;
    }
    
    public void setIsLit(boolean litStatus) {
    	isLit = litStatus;
    }
}

