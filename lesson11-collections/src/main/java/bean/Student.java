package bean;

import java.util.Objects;

import javax.security.auth.login.FailedLoginException;

public class Student {
	private int id;
	private String name;

	public Student() {
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(!(obj instanceof Student)) {
			return false;
			
		}
		Student that = (Student) obj;
		return getId() == that.getId();
		
				
	}

	@Override
	public String toString() {
		return id + ", " + name;

	}
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	/*@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}*/

}