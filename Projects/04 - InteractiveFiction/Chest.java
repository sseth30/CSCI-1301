// For an overview of the program and sample inputs, be sure to check out `InteractiveFiction.md`

public class Chest {
	
	// Instance variables
    private boolean locked;
    private Key keyUsedToLock;  
    private String contents;  

    public Chest() {
        this.locked = true; 
        this.contents = ""; 
    }

    
    public void lock(Key theKey) {
        this.keyUsedToLock = theKey;
        this.locked = true;
    }

    // Unlock method only if the condition is true
    public void unLock(Key theKey) {
        if (this.keyUsedToLock != null && this.keyUsedToLock.equals(theKey)) {
            this.locked = false;
        }
    }

    
    public boolean isLocked() {
        return this.locked;
    }

    
    public String getContents() {
        return this.contents;
    }

    
    public void setContents(String contents) {
        this.contents = contents;
    }
}
