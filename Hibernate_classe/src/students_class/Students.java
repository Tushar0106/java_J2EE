package students_class;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Students {
	@Id
	private int s_id;
	private String s_name;
	private String s_phone;
	private String s_city;
	private String marks;

	public Students() {
	}

	public Students( String s_name, String s_phone, String s_city, String marks) {
		super();
		
		this.s_name = s_name;
		this.s_phone = s_phone;
		this.s_city = s_city;
		this.marks = marks;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_phone() {
		return s_phone;
	}

	public void setS_phone(String s_phone) {
		this.s_phone = s_phone;
	}

	public String getS_city() {
		return s_city;
	}

	public void setS_city(String s_city) {
		this.s_city = s_city;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [s_id=" + s_id + ", s_name=" + s_name + ", s_phone=" + s_phone + ", s_city=" + s_city
				+ ", marks=" + marks + "]";
	}
}
