package designpatterns.builder;

public class User {
	// All final attributes
	// the class is constructed always from builder, not by its own constructor
	private final String name;
	private final String phone;
	private final String email;
	private final int age;
	
	public static class UserBuilder {
		private String name;
		private String phone;
		private String email;
		private int age;
		
		public UserBuilder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		public UserBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}
		
		public UserBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
	
	// constructor is private
	private User(UserBuilder userBuilder) {
		this.name = userBuilder.name;
		this.phone = userBuilder.phone;
		this.email = userBuilder.email;
		this.age = userBuilder.age;
	}
	
	// Can specify getters but no setters to retain immutability
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "User: " + name + ", Phone: " + phone;
	}
}