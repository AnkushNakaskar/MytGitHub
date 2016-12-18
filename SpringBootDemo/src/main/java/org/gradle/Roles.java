package org.gradle;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Roles")
public class Roles implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne()
	@JoinColumn(name = "user_id", referencedColumnName = "id")
	private Account user;


//	@Column(name="user_id")
//	private Long roles;
	
	@Override
	public String toString() {
		return "Roles [id=" + id + ", user=" + user + ", role=" + role + "]";
	}

	@Column(name = "role")
	private String role;

	public Roles() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account getAccount() {
		return user;
	}

	public void setAccount(Account account) {
		this.user = account;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	public Long getUserId() {
//		return roles;
//	}
//
//	public void setUserId(Long userId) {
//		this.roles = userId;
//	}

}
