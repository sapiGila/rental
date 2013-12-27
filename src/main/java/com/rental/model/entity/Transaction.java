package com.rental.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="TRANSACTION")
public class Transaction {
	@Id
	@Column(name="ID", length=30)
	private String id;
	
	@Column(name="FID_USER", length = 19)
	private Long fidUser;
	
	@Column(name = "START_DATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name = "RETURN_DATE")
	@Temporal(TemporalType.DATE)
	private Date returnDate;
	
	@Column(name = "ACTUAL_DATE")
	@Temporal(TemporalType.DATE)
	private Date actualDate;
	
	@Column(name="GUARANTEE", length=30)
	private String guarantee;
	
	@Column(name="STATUS", length=1)
    private String status;
	
	@Column(name="TOTAL_QTY")
	private Integer totalQty;
	
	@Column(name = "TOTAL_PRICE", precision = 18, scale = 4)
	private BigDecimal totalPrice;
	
	@Column(name = "TOTAL_PINALTY", precision = 18, scale = 4)
	private BigDecimal totalPinalty;
	
	@Column(name="FID_USER_ADMIN", length = 19)
	private Long fidUserAdmin;
	
	@Column(name="CREATE_BY", length=20)
	private String createBy;
	
	@Column(name="CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name="LAST_UPDATE_BY", length=20)
	private String lastUpdateBy;

	@Version
	@Column(name="LAST_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate;
	
	@ManyToOne
	@JoinColumn(name = "FID_USER", insertable = false, updatable = false)
	@ForeignKey(name = "none")
	private User user;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transaction")
	@ForeignKey(name = "none")
	private List<TransactionItem> transactionItems = new ArrayList<TransactionItem>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getFidUser() {
		return fidUser;
	}

	public void setFidUser(Long fidUser) {
		this.fidUser = fidUser;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Date getActualDate() {
		return actualDate;
	}

	public void setActualDate(Date actualDate) {
		this.actualDate = actualDate;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(Integer totalQty) {
		this.totalQty = totalQty;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalPinalty() {
		return totalPinalty;
	}

	public void setTotalPinalty(BigDecimal totalPinalty) {
		this.totalPinalty = totalPinalty;
	}

	public Long getFidUserAdmin() {
		return fidUserAdmin;
	}

	public void setFidUserAdmin(Long fidUserAdmin) {
		this.fidUserAdmin = fidUserAdmin;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<TransactionItem> getTransactionItems() {
		return transactionItems;
	}

	public void setTransactionItems(List<TransactionItem> transactionItems) {
		this.transactionItems = transactionItems;
	}
}
