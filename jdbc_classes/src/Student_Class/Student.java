package Student_Class;

public class Student {

	private int id;
	private String name,phone,city,marks;
	public Student() {}
	public Student(String name, String phone, String city, String marks) {
		super();
		
		this.name = name;
		this.phone = phone;
		this.city = city;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + ", city=" + city + ", marks=" + marks
				+ "]";
	}
	
}
