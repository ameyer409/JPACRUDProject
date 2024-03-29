package com.skilldistillery.toestub.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="toe_stubs")
public class ToeStub {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.STRING)
	private Toe toe;
	@Column(name="stub_time")
	private LocalDate stubTime;
	@Column(name="cracked_nail")
	private boolean crackedNail;
	@Column(name="still_healing")
	private boolean stillHealing;
	
	public ToeStub() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isCrackedNail() {
		return crackedNail;
	}

	public void setCrackedNail(boolean crackedNail) {
		this.crackedNail = crackedNail;
	}

	public Toe getToe() {
		return toe;
	}

	public void setToe(Toe toe) {
		this.toe = toe;
	}

	public LocalDate getStubTime() {
		return stubTime;
	}

	public void setStubTime(LocalDate stubTime) {
		this.stubTime = stubTime;
	}

	public boolean isStillHealing() {
		return stillHealing;
	}

	public void setStillHealing(boolean stillHealing) {
		this.stillHealing = stillHealing;
	}

	@Override
	public String toString() {
		return "ToeStub [id=" + id + ", toe=" + toe + ", stubTime=" + stubTime + ", crackedNail=" + crackedNail
				+ ", stillHealing=" + stillHealing + "]";
	}
	
	
}
