package assignment;

public class Bike {
	public void applyBreak() {
		System.out.println("applyBreak");
	}
	public void soundHorn() {
		System.out.println("soundHorn");
	}
	public static void main(String[] args) {
		Car name=new Car();
		name.applyBreak();
		name.soundHorn();
		
		Bike kick=new Bike();
		kick.applyBreak();
		kick.soundHorn();
			
		
	}

}
