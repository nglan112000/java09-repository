package bean;

public class Item implements Comparable<Item> {
	private int id;
	private String name;

	public Item() {
	}

	
	public Item(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return " " + id + ", " + name;
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
	public int compareTo(Item o) {
		
		return getName().compareTo(o.getName());
	}

}