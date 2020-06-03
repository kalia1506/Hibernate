package com.nt.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="LOCK_INSURANCEPOLICY")
public final class InsurancePolicy implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int policyId;
	private  String policyName;
	private  String company;
	private  String policyType;
	private  float tenure;
	@Version
	private  int updateCount;
	
	public  InsurancePolicy() {
		System.out.println("InsuracePolicy::0-param constructor");
	}
	
	public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public float getTenure() {
		return tenure;
	}
	public void setTenure(float tenure) {
		this.tenure = tenure;
	}

	@Override
	public String toString() {
		return "InsurancePolicy [policyId=" + policyId + ", policyName=" + policyName + ", company=" + company
				+ ", policyType=" + policyType + ", tenure=" + tenure + ", updateCount=" + updateCount + "]";
	}

	
	
	

}
