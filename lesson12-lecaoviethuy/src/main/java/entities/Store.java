package entities;

import java.math.BigDecimal;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Store {

    private Long storeId;
    private Long referenceStoreId;
    private BigDecimal storePreviousDay;
    private BigDecimal expectedSales;
    private Boolean isSelected;

    public Store() {

    }
    
    public Store(Store store) {
    	this(store.storeId, store.referenceStoreId, store.storePreviousDay, store.expectedSales, store.isSelected);
    }

    public Store(final Long storeId, final Long referenceStoreId, final BigDecimal storePreviousDay, final BigDecimal expectedSales, final Boolean isSelected) {
        this.storeId = storeId;
        this.referenceStoreId = referenceStoreId;
        this.storePreviousDay = storePreviousDay;
        this.expectedSales = expectedSales;
        this.isSelected = isSelected;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(final Long storeId) {
        this.storeId = storeId;
    }

    public Long getReferenceStoreId() {
        return referenceStoreId;
    }

    public void setReferenceStoreId(final Long referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    public BigDecimal getStorePreviousDay() {
        return storePreviousDay;
    }

    public void setStorePreviousDay(final BigDecimal storePreviousDay) {
        this.storePreviousDay = storePreviousDay;
    }

    public BigDecimal getExpectedSales() {
        return expectedSales;
    }

    public void setExpectedSales(final BigDecimal expectedSales) {
        this.expectedSales = expectedSales;
    }

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(final Boolean selected) {
        isSelected = selected;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Store store = (Store) o;
        return storeId == store.getStoreId();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(storeId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("storeId", storeId)
                .append("referenceStoreId", referenceStoreId)
                .append("storePreviousDay", storePreviousDay)
                .append("expectedSales", expectedSales)
                .append("isSelected", isSelected)
                .toString();
    }
}