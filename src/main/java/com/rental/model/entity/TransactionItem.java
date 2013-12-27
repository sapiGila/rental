package com.rental.model.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name="TRANSACTION_ITEM")
public class TransactionItem {
	@Id
	@Column(name="ID", length = 19)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="FID_TRANSACTION", length = 30)
	private String fidTransaction;
	
	@Column(name="FID_MOVIE_ITEM", length = 19)
	private Long fidMovieItem;
	
	@Column(name="QTY")
	private Integer qty;
	
	@Column(name = "PRICE", precision = 18, scale = 4)
	private BigDecimal price;
	
	@Column(name = "PINALTY", precision = 18, scale = 4)
	private BigDecimal pinalty;
	
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
	@JoinColumn(name = "FID_TRANSACTION", insertable = false, updatable = false)
	@ForeignKey(name = "none")
	private Transaction transaction;
	
	@ManyToOne
	@JoinColumn(name = "FID_MOVIE_ITEM", insertable = false, updatable = false)
	@ForeignKey(name = "none")
	private MovieItem movieItem;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFidTransaction() {
		return fidTransaction;
	}

	public void setFidTransaction(String fidTransaction) {
		this.fidTransaction = fidTransaction;
	}

	public Long getFidMovieItem() {
		return fidMovieItem;
	}

	public void setFidMovieItem(Long fidMovieItem) {
		this.fidMovieItem = fidMovieItem;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getPinalty() {
		return pinalty;
	}

	public void setPinalty(BigDecimal pinalty) {
		this.pinalty = pinalty;
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

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public MovieItem getMovieItem() {
		return movieItem;
	}

	public void setMovieItem(MovieItem movieItem) {
		this.movieItem = movieItem;
	}
}
