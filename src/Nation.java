
public class Nation {
	
	private String name;
	private int population;
	private Nation enemy;
	private Nation ally;
	
	public Nation(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	public void setEnemy(Nation n) {
		enemy = n;
		
		if(n.enemy != this) {
			n.setEnemy(this);
		}
		
		//System.out.print(n);
	}
	
	public void setAlly(Nation n) {
		ally = n;
		
		if(n.ally != this) {
			n.setAlly(this);
		}
	}
	
	public String toString() {
		if (enemy == null && ally != null ) {
			return this.name + " has " + this.population + " people. It has no enemy. Its ally is " + ally.name + "."; 
		}else if(enemy != null && ally == null) {
			return this.name + " has " + this.population + " people. Its enemy is " + enemy.name + ". It has no ally."; 
		}else if(enemy == null && ally == null) {
			return this.name + " has " + this.population + " people. It has no enemy or ally.";
		}else {
			return this.name +  " has " + this.population + " people. Its enemy is " + enemy.name + " and its ally is " + ally.name + ".";
		}
		
	}
	
	public void backstab() {
		Nation temp = enemy;
		enemy = ally;
		ally = temp;
	}
	
	public String getRelationship(Nation n) {
		if (n == enemy) {
			return "Enemy";
		}else if(n == ally) {
			return "Ally";
		}else {
			return "No relationship";
		}
	}


}
