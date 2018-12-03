
public class book {
	private String name;
	private String author;
	public book(String a,String b){
		name = a;
		author = b;
	}
	public book(){
		name = "Harry Potter";
		author = "Rouling";
	}
	public book(String a){
		name = a;
		author = "Pushkin";
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	public String getName(String name){
		return name;
	}
	public String getAuthor(String author){
		return author;
	}
	public String toString (){
		return this.name+" author is "+this.author;
	}
	public void whoseВook(){
		System.out.println(name+" "+author+"'s book");
	}
}
