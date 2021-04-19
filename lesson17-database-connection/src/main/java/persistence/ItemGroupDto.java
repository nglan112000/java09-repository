package persistence;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class ItemGroupDto {
	
	public static final String ID="igrId";
	public static final String NAME="igrName";
	public static final String ITEM_DETAILS="itemList";
	public static final String TOTAL_OF_ITEMS="totalOfItem";
	
	
	private Integer igrId;
	private String igrName;
	private String itemList;
	private Double totalOfItem;
	
	public ItemGroupDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public ItemGroupDto(Integer igrId, String igrName, String itemList, Double totalOfItem) {
		super();
		this.igrId = igrId;
		this.igrName = igrName;
		this.itemList = itemList;
		this.totalOfItem = totalOfItem;
	}


	public Integer getIgrId() {
		return igrId;
	}
	public void setIgrId(Integer igrId) {
		this.igrId = igrId;
	}
	public String getIgrName() {
		return igrName;
	}
	public void setIgrName(String igrName) {
		this.igrName = igrName;
	}
	public String getItemList() {
		return itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
	public Double getTotalOfItem() {
		return totalOfItem;
	}
	public void setTotalOfItem(Double totalOfItem) {
		this.totalOfItem = totalOfItem;
	}


	@Override
	public String toString() {
		return "ItemGroupDto [igrId=" + igrId + ", igrName=" + igrName + ", itemList=" + itemList + ", totalOfItem="
				+ totalOfItem + "]";
	}
	
	
	
	
}
