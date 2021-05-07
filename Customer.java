package com.myshopping.pojo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="sys_customer")
public class Customer {

	@Id
	//@GeneratedValue // will generate the primary key value 
	private int id;
	
	@Column(length=15) private String name;
	@Column(length=20) private String email;
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CustomerSubscriptionLink", 
			joinColumns={@JoinColumn(name="cust_id")},
			inverseJoinColumns={@JoinColumn(name="sub_id")})
	private Set<Subscription> subscriptions = new HashSet<Subscription>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
