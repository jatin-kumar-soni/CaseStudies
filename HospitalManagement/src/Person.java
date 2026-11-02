/**
 * This class stores details about a person: person can be a patient doctor nurse, anyone
 * @author Jatin
 * @since 01/11/2026 2:23PM
 */


public abstract class Person {
	private String name;
	private String phoneNumber;
	private String  gender;
	private int age;
	public Person(String name, String phone, String gender, int age) {
		super();
		this.name = name;
		this.phoneNumber = phone;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public abstract void details();
	
}
