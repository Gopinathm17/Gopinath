package assignment;

public class Mobile {
	String mobileModel="poco";
	float mobileWeight=150.15f;
	boolean isFullCharged=false;
	int mobileCost=9999;
	
	public void makeaCall() {
		System.out.println("makeaCall");
	}
	public void sendMsg() {
		System.out.println("sendMsg");
	}
	
	public static void main(String[] args) {
		
		Mobile name=new Mobile();
		name.makeaCall();
		name.sendMsg();
		System.out.println("This is my mobile");
		System.out.println(name.mobileModel);
		System.out.println(name.mobileWeight);
		System.out.println(name.isFullCharged);
		System.out.println(name.mobileCost);
						
	}
	

}
