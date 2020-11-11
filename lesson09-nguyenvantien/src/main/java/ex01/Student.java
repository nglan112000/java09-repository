package ex01;

public class Student {
	private int id;
	private String name;
	private Rank rank;
	public Student(int id, String name, Rank rank) {
		this.id = id;
		this.name = name;
		this.rank = rank;
	}
	

	@Override
	public String toString() {
		return id + "-" + name + "-" + rank;
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
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	
	
	
}