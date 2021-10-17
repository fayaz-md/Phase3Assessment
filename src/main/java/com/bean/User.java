package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="firstname")
	private String firstname;
	@Column(name="email")
	private String email;
	@Column(name="isadmin")
	private int Admin;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + userName + ", password=" + password + ", firstname=" + firstname
				+ ", email=" + email + ", isAdmin=" + Admin + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAdmin() {
		return Admin;
	}

	public void setAdmin(int admin) {
		Admin = admin;
	}
}
