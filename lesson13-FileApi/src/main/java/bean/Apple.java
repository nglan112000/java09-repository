package bean;

import java.io.Serializable;
import java.util.Objects;

public class Apple implements Serializable{
	
	private static final long serialVersionUID = -8848579699000821747L;
	
	private String id;
	private String color;
	private double weight;
	private String origin;
	
	public Apple() {
	}

	public Apple(String id) {
		this.id = id;
	}
	
	public Apple(String id, String color, double weight, String origin) {
		this.id = id;
		this.color = color;
		this.weight = weight;
		this.origin = origin;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(!(obj instanceof Apple)) {
			return false;
		}
		
		Apple tmp = (Apple) obj;
		
		return id.equals(tmp.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	@Override
	public String toString() {
		return id + ", " + color + ", " + weight + ", " + origin;
	}
	
	public static Apple toApple(String line) {
		String[] splited = line.split(", ");
		return new Apple(splited[0], splited[1], Double.parseDouble(splited[2]), splited[3]);
	}
}