
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Nation aztec = new Nation("Aztec",1000);
		Nation mongolian = new Nation("Mongolian", 2000);
		Nation sumerian = new Nation("Sumerian", 2000);
		
		//aztec.setEnemy(mongolian);
		aztec.setAlly(sumerian);
		
		
		System.out.println(aztec);
		System.out.println(sumerian);
		
		//aztec.backstab();
		//System.out.println(aztec);
		
//		System.out.println(aztec.getRelationship(mongolian));
//		
//		FireNation eW = new FireNation("Aztec", 1000, "Eagle Warrior", 390);
//		
//		eW.setEnemy(mongolian);
//		eW.setAlly(sumerian);
//		System.out.println(eW);
	}

}
