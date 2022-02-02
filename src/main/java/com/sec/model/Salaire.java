package com.sec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long brute,nette,idemp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getBrute() {
		return brute;
	}
	public void setBrute(long brute) {
		this.brute = brute;
	}
	public long getNette() {
		return nette;
	}
	public void setNette(long nette) {
		this.nette = nette;
	}
	public long getIdemp() {
		return idemp;
	}
	public void setIdemp(long idemp) {
		this.idemp = idemp;
	}
	
}
