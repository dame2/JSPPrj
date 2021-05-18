package web.entity;

import java.util.Date;

public class Category {
	private int id;
	private String title;
	private Date createdAt;
	private char createdBy;
	private Date modifiedAt;
	private char modifiedBy;
	private int categoryOrder;
	private char DelYN;
	private char activeYN;
	
	
	
	
	public Category() {
		
	}


	public Category(int id, String title, Date createdAt, char createdBy, Date modifiedAt, char modifiedBy,
			int categoryOrder, char delYN, char activeYN) {
		super();
		this.id = id;
		this.title = title;
		this.createdAt = createdAt;
		this.createdBy = createdBy;
		this.modifiedAt = modifiedAt;
		this.modifiedBy = modifiedBy;
		this.categoryOrder = categoryOrder;
		DelYN = delYN;
		this.activeYN = activeYN;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public char getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(char createdBy) {
		this.createdBy = createdBy;
	}


	public Date getModifiedAt() {
		return modifiedAt;
	}


	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}


	public char getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(char modifiedBy) {
		this.modifiedBy = modifiedBy;
	}


	public int getCategoryOrder() {
		return categoryOrder;
	}


	public void setCategoryOrder(int categoryOrder) {
		this.categoryOrder = categoryOrder;
	}


	public char getDelYN() {
		return DelYN;
	}


	public void setDelYN(char delYN) {
		DelYN = delYN;
	}


	public char getActiveYN() {
		return activeYN;
	}


	public void setActiveYN(char activeYN) {
		this.activeYN = activeYN;
	}




	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + ", createdAt=" + createdAt + ", createdBy=" + createdBy
				+ ", modifiedAt=" + modifiedAt + ", modifiedBy=" + modifiedBy + ", categoryOrder=" + categoryOrder
				+ ", DelYN=" + DelYN + ", activeYN=" + activeYN + "]";
	}
	
	
}
