
public class Vehicle {
	String czyjedzie() {
		return "Jedzie";
	}
	String JakJedzie(String tekst) {
		return tekst;
	}
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.print("No parameters");
		}else {
			System.out.println("Number of parameters"+args.length);
		}
	}

}
