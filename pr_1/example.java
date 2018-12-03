
public class example {
	public static void main (String[] args){
		book b1 = new book("Kapitanskaya docha", "Pushkin");
		book b2 = new book("Green mile", "King");
		book b3 = new book("Bulgakov");
		b3.setName("Master and Margarita");
		System.out.println(b1);
		b1.whoseВook();
		b2.whoseВook();
		b3.whoseВook();
	}
}
