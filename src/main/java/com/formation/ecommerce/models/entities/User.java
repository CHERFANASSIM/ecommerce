package com.formation.ecommerce.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity

@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long idUser;
	/*
	 * @Column(name = "user_name") private String userName; private String password;
	 * private boolean actived; /*
	 * 
	 * @OneToMany
	 * 
	 * @JoinColumn(name = "user_id") private List<Role> roles;
	 */

	@OneToOne
	private Account account;

	public User() {
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
