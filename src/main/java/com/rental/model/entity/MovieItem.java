package com.rental.model.entity;

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
@Table(name="MOVIE_ITEM")
public class MovieItem {
	@Id
	@Column(name="ID", length=30)
	private String id;

	@Column(name="TYPE", length=3)
	private String type;
	
	@Column(name="QTY_DISK")
	private Integer qty_disk;
	
	@Column(name="STATUS", length=1)
	private String status;
	
	@Column(name="FID_MOVIE", length = 19)
	private Long fidMovie;
	
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
	@JoinColumn(name = "FID_MOVIE", insertable = false, updatable = false)
	@ForeignKey(name = "none")
	private Movie movie;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "movieItem")
	@ForeignKey(name = "none")
	private List<TransactionItem> transactionItems = new ArrayList<TransactionItem>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getQty_disk() {
		return qty_disk;
	}

	public void setQty_disk(Integer qty_disk) {
		this.qty_disk = qty_disk;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getFidMovie() {
		return fidMovie;
	}

	public void setFidMovie(Long fidMovie) {
		this.fidMovie = fidMovie;
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

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public List<TransactionItem> getTransactionItems() {
		return transactionItems;
	}

	public void setTransactionItems(List<TransactionItem> transactionItems) {
		this.transactionItems = transactionItems;
	}
	
	
	
}
