package chuong2;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
    public String getName() {
		return name;
	}
    public String getEmail() {
		return email;
	}
    public void setEmail(String email) {
		this.email = email;
	}
    public char getGender() {
		return gender;
	}
    public String toString() {
		return "Author[name=?,email=?,gender=?]";

	}
    public static void main(String[] args) {
		Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
		System.out.println(ahTeck);
		ahTeck.setEmail("paulTan@nowhere.com");
		System.out.println("name is: " + ahTeck.getName());
		System.out.println("email is: " + ahTeck.getEmail());
		System.out.println("gender is: " + ahTeck.getGender());
	}

}
