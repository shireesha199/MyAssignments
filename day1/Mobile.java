package week1.day1;

public class Mobile {
public void makeCall() {
String mobileModel="samsung";
float mobileWeight=10.6f;
System.out.println("mobileWeight" + mobileWeight);
System.out.println("mobileModel" + mobileModel);
}
public void sendMsg() {
	boolean isFullCharged=true;
	int mobileCost=15000;
	System.out.println("isFullCharged" + isFullCharged);
	System.out.println("mobileCost" + mobileCost);
	}
public static void main(String[] args) {
	Mobile m1=new Mobile();
	m1.makeCall();
	m1.sendMsg();
	System.out.println("This is my mobile");
}
}