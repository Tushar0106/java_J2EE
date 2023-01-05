package jdbc_classes;

public class Students {
	int id;
	String name;
	String phone;
	String city;
	String marks;

	public Students() {}
	
	public Students(String name,  String phone, String city, String marks) {
		super();
		
		this.name = name;
		this.city = city;
		this.phone = phone;
		this.marks = marks;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Students [city=" + city + ", id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
}
