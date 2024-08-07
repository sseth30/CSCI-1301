// For an overview of the program and sample inputs, be sure to check out `InteractiveFiction.md`

/*You do not need to modify this class
 * 
 */
public class Key {

	//This method is called when you are ready to unlock a chest with the key obtained from the map
	public void use(Chest onChest){
		onChest.unLock(this);
	}
}

