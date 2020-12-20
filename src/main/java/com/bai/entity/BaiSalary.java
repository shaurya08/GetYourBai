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
public class BaiSalary implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long baiSalaryId;
	
//	@Id
//	@Column(name="bai_id")
//	private long baiId;
	
	@OneToOne
	@JoinColumn(name="bai_id")
	private BaiSuper bai;
	
	private double expectedMonthlySalary;
	
	private double expectedWeeklySalary;
	
	private double expectedDailySalary;
	
	private double variance;
	
	private double previousSalary;
	
	private double workingHours;
	
	private double fullDaySalary;

	public BaiSalary() {
		
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



	public BaiSuper getBai() {
		return bai;
	}

	public void setBai(BaiSuper bai) {
		this.bai = bai;
	}

	public double getExpectedMonthlySalary() {
		return expectedMonthlySalary;
	}

	public void setExpectedMonthlySalary(double expectedMonthlySalary) {
		this.expectedMonthlySalary = expectedMonthlySalary;
	}

	public double getExpectedWeeklySalary() {
		return expectedWeeklySalary;
	}

	public void setExpectedWeeklySalary(double expectedWeeklySalary) {
		this.expectedWeeklySalary = expectedWeeklySalary;
	}

	public double getExpectedDailySalary() {
		return expectedDailySalary;
	}

	public void setExpectedDailySalary(double expectedDailySalary) {
		this.expectedDailySalary = expectedDailySalary;
	}

	public double getVariance() {
		return variance;
	}

	public void setVariance(double variance) {
		this.variance = variance;
	}

	public double getPreviousSalary() {
		return previousSalary;
	}

	public void setPreviousSalary(double previousSalary) {
		this.previousSalary = previousSalary;
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public double getFullDaySalary() {
		return fullDaySalary;
	}

	public void setFullDaySalary(double fullDaySalary) {
		this.fullDaySalary = fullDaySalary;
	}

	public long getBaiSalaryId() {
		return baiSalaryId;
	}

	public void setBaiSalaryId(long baiSalaryId) {
		this.baiSalaryId = baiSalaryId;
	}
	
}
