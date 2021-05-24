package dto;

// RemainingItem
// Hoặc ItemDto
public class RemainItem {
	private Integer id;
	private String name;
	private Integer amount;
	public RemainItem(Integer id, String name, Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}
	
	public RemainItem() {
		// Xóa code thừa
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "RemainItem [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

}


