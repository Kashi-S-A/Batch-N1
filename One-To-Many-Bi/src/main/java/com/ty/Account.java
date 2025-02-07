package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	private int acc;

	private String name;

	@ManyToOne
	@JoinColumn(name = "bank_id")
	private Bank bank;

	public Account() {
	}

	public Account(int acc, String name) {
		this.acc = acc;
		this.name = name;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
