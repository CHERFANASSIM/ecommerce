package com.formation.ecommerce.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = " user_name", unique = true, nullable = false)
	private String userName;
	@Column(name = " pass_word", nullable = false)
	private String password;

	@Column(name = "activated", nullable = false)
	private boolean actived;

	@ManyToOne
	@JoinColumn(name = "role_id", nullable = false)
	private Role role;

	public Account() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean isActived() {
		return actived;
	}

	public void setActived(boolean actived) {
		this.actived = actived;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", userName=" + userName + ", password=" + password + ", actived=" + actived
				+ ", role=" + role + "]";
	}
//ne pas printé le mote de passe

}