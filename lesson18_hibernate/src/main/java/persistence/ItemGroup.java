package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "LoaiHang")
@NamedQueries({
	@NamedQuery(name = "SELECT_ALL_HQL",
				query = "FROM ItemGroup ")
})

@NamedNativeQueries({
	@NamedNativeQuery(name = "SELECT_ALL_NATIVE",
				query = "SELECT * FROM ItemGroup ",
				resultClass = ItemGroup.class)
})
public class ItemGroup {
	@Id
	@Column(name = "Maloai")
	private Integer igId;

	@Column(name = "TenLoai")
	private String igName;
	
	@OneToMany(mappedBy = "itemGroup", fetch = FetchType.EAGER)
	private List<Item> items;

	// JPA default constructor
	public ItemGroup() {

	}

	public ItemGroup(Integer igId, String igName) {
		this.igId = igId;
		this.igName = igName;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "ItemGroup [igId=" + igId + ", igName=" + igName + "]";
	}

}