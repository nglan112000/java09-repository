package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KichCo")
public class Size {

	@Id
	@Column(name = "KiHieu")
	private Integer id;

	@Column(name = "MoTa")
	private String description;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "size")
	private List<ItemSize> itemSizes;

	public Size() {

	}

	public Size(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	
	public Size(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Size [id=" + id + ", description=" + description + "]";
	}

}
