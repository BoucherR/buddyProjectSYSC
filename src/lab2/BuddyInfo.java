package lab2;

public class BuddyInfo {
	
	//Fields
	private String name;
	private int age;
	private double weight;
	private boolean alive; // false is dead, true is alive
	
	//Constructors
	public BuddyInfo() {
		name = "unknown";
		age = 0;
		weight = 0.0;
		alive = false;
	}
	
	public BuddyInfo(String inputName, int inputAge, double inputWeight, boolean inputAlive) {
		this.name = inputName;
		this.age = inputAge;
		this.weight = inputWeight;
		this.alive = inputAlive;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	// Main
	public static void main(String[] args) {
		BuddyInfo homer = new BuddyInfo("Homer", 42, 240.2, true);		
		System.out.println("Hello, " + homer.getName());

	}

}
