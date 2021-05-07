package com.myshopping.pojo;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="sys_subscription")
public class Subscription {

	@Id
	//@GeneratedValue
	private int id;
	
	@Column(length=20) private String type;
	
	private int duration;

	@ManyToMany
	@JoinTable(name="CustomerSubscriptionLink", 
			joinColumns={@JoinColumn(name="sub_id")},
			inverseJoinColumns={@JoinColumn(name="cust_id")})
	private Set<Customer> customers;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Set<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}
}
