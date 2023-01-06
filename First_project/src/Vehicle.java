
public class Vehicle {
	String czyjedzie() {
		return "Jedzie";
	}
	String JakJedzie(String tekst) {
		return tekst;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle Car = new Vehicle();
		Vehicle Motor = new Vehicle();
		System.out.println(Car.JakJedzie("Git")+Motor.czyjedzie());
	}

}
