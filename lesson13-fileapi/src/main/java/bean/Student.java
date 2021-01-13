package bean;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Student {
	@JsonInclude(Include.NON_NULL)
	private String id;
	@JsonInclude(Include.NON_NULL)
	private String name;
	@JsonInclude(Include.NON_NULL)
	private List<String> languages;
	@JsonInclude(Include.NON_NULL)
	private Map<String, BigDecimal> points;
	@JsonInclude(Include.NON_NULL)
	private List<Grade> grades;

	public Student() {
	}

	public Student(String id, String name, List<String> languages, Map<String, BigDecimal> points, List<Grade> grades) {
		this.id = id;
		this.name = name;
		this.languages = languages;
		this.points = points;
		this.grades = grades;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public List<Grade> getGrades() {
		return grades;
	}

	public void setGrades(List<Grade> grades) {
		this.grades = grades;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	public Map<String, BigDecimal> getPoints() {
		return points;
	}

	public void setPoints(Map<String, BigDecimal> points) {
		this.points = points;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(getId()).append(getName()).append(getLanguages()).append(getPoints())
				.toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student that = (Student) obj;
		return new EqualsBuilder().append(getId(), that.getId()).append(getName(), that.getName())
				.append(getLanguages(), that.getLanguages()).append(getPoints(), that.getPoints()).isEquals();
	}
}
