package com.bai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BaiSuper {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bai_id")
	private long baiId;
	private String baiName;
	private String baiGender;
	private String baiAadhar;
	private String baiReligion;
	private String baiProfile;
	private double baiExp;
	@OneToOne(mappedBy = "bai", cascade = CascadeType.ALL)
	private BaiSalary baiSalary;
	@OneToOne(mappedBy = "bai", cascade = CascadeType.ALL)
	private BaiWorkType baiWorkType;
	
	public BaiSuper() {
		
	}

	public Long getBaiId() {
		return baiId;
	}

	
	public String getBaiName() {
		return baiName;
	}

	public void setBaiName(String baiName) {
		this.baiName = baiName;
	}

	public String getBaiGender() {
		return baiGender;
	}

	public void setBaiGender(String baiGender) {
		this.baiGender = baiGender;
	}

	public String getBaiAadhar() {
		return baiAadhar;
	}

	public void setBaiAadhar(String baiAadhar) {
		this.baiAadhar = baiAadhar;
	}

	public String getBaiReligion() {
		return baiReligion;
	}

	public void setBaiReligion(String baiReligion) {
		this.baiReligion = baiReligion;
	}

	public String getBaiProfile() {
		return baiProfile;
	}

	public void setBaiProfile(String baiProfile) {
		this.baiProfile = baiProfile;
	}

	public double getBaiExp() {
		return baiExp;
	}

	public void setBaiExp(double baiExp) {
		this.baiExp = baiExp;
	}

	public void setBaiId(Long baiId) {
		this.baiId = baiId;
	}

	public BaiSalary getBaiSalary() {
		return baiSalary;
	}

	public void setBaiSalary(BaiSalary baiSalary) {
		this.baiSalary = baiSalary;
	}

	public BaiWorkType getBaiWorkType() {
		return baiWorkType;
	}

	public void setBaiWorkType(BaiWorkType baiWorkType) {
		this.baiWorkType = baiWorkType;
	}

}
