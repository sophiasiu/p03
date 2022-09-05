
public class FireNation extends Nation{
	
	
	private String uniqueUnit;
	private int numOfUnits;
	
		
	public FireNation(String name, int population, String uniqueUnit, int numOfUnits) {
		super(name,population);
		this.uniqueUnit = uniqueUnit;
		this.numOfUnits = numOfUnits;
	}
	
	public String toString() {
		return super.toString() + "It has " + this.numOfUnits + " unique units of " + this.uniqueUnit;
	}
}
