package com.hackerearth.hackerills.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value ={"handler","hibernateLazyInitializer","FieldHandler"})
public class HackerBill {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billId;
	private String billNumber;
	private String billedTo;
	private String billedDate;
	private long billedPrice;
	private long tax;
	private long totalPrice;
	private String dueDate;
	
	
	public HackerBill() {
		
	}
	
	
	
	public HackerBill(String billNumber, String billedTo, String billedDate, long billedPrice, long tax, long totalPrice,
			String dueDate) {
		super();
		this.billNumber = billNumber;
		this.billedTo = billedTo;
		this.billedDate = billedDate;
		this.billedPrice = billedPrice;
		this.tax = tax;
		this.totalPrice = totalPrice;
		this.dueDate = dueDate;
	}



	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getBilledTo() {
		return billedTo;
	}
	public void setBilledTo(String billedTo) {
		this.billedTo = billedTo;
	}
	public String getBilledDate() {
		return billedDate;
	}
	public void setBilledDate(String billedDate) {
		this.billedDate = billedDate;
	}
	public long getBilledPrice() {
		return billedPrice;
	}
	public void setBilledPrice(long billedPrice) {
		this.billedPrice = billedPrice;
	}
	public long getTax() {
		return tax;
	}
	public void setTax(long tax) {
		this.tax = tax;
	}
	public long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}



	public String getDueDate() {
		return dueDate;
	}



	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
}
