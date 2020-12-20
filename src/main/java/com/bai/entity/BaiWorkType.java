package com.bai.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BaiWorkType implements Serializable{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long workId;
	
//	@Id
//	@Column(name="bai_id")
//	private long baiId;
	
	@OneToOne
	@JoinColumn(name="bai_id")
	private BaiSuper bai;
	private boolean cleaningSw;
	private boolean utensilSw;
	private boolean cookSw;
	private boolean clothesSw;
	private boolean elderSw;
	private boolean babySittingSw;
	private boolean allDaySw;
	
	public BaiWorkType() {
		
	}
	
//	public long getBaiId() {
//		return baiId;
//	}
//
//
//
//	public void setBaiId(long baiId) {
//		this.baiId = baiId;
//	}
	
	public long getWorkId() {
		return workId;
	}
	public void setWorkId(long workId) {
		this.workId = workId;
	}
	public boolean isCleaningSw() {
		return cleaningSw;
	}
	public void setCleaningSw(boolean cleaningSw) {
		this.cleaningSw = cleaningSw;
	}
	public boolean isUtensilSw() {
		return utensilSw;
	}
	public void setUtensilSw(boolean utensilSw) {
		this.utensilSw = utensilSw;
	}
	public boolean isCookSw() {
		return cookSw;
	}
	public void setCookSw(boolean cookSw) {
		this.cookSw = cookSw;
	}
	public boolean isClothesSw() {
		return clothesSw;
	}
	public void setClothesSw(boolean clothesSw) {
		this.clothesSw = clothesSw;
	}
	public boolean isElderSw() {
		return elderSw;
	}
	public void setElderSw(boolean elderSw) {
		this.elderSw = elderSw;
	}
	public boolean isBabySittingSw() {
		return babySittingSw;
	}
	public void setBabySittingSw(boolean babySittingSw) {
		this.babySittingSw = babySittingSw;
	}
	public boolean isAllDaySw() {
		return allDaySw;
	}
	public void setAllDaySw(boolean allDaySw) {
		this.allDaySw = allDaySw;
	}

	
}
