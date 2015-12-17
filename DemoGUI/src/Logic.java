
public class Logic {
	private int myNbr;
	
	public Logic(int myNbr) {
		this.myNbr = myNbr;
	}
	
	public int getCounter() {
		return myNbr;
	}
	
	public void increment() {
		myNbr++;
	}
	
	public void decrease () {
		myNbr--;
	}

	public void incrementAmount(int i) {
		myNbr += i;
		
	}

	public void decrementAmount(int i) {
		myNbr -= i;
		
	}
	
}
