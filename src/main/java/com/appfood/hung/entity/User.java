package com.appfood.hung.entity;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;



@Entity
@Table(name = "Accounts")

@Data
@AllArgsConstructor
@NoArgsConstructor
 public class User{
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String email;

	@Column(length = 20)
	private String password;

	@Column(length = 50)
	private Date createDate;
	
	@Column(length = 50)
	private Date updateDate;

	public User(String email, String password) {
		this.email = email;
		this.password = password;

	}


	
	/*@OneToMany(mappedBy = "account")
	private Set<Order> orders;*/
	
	@PrePersist
	public void preCreate() {
		createDate = new Date();
	}
	
	@PreUpdate
	public void prUpdate() {
		updateDate = new Date();
	}



}
