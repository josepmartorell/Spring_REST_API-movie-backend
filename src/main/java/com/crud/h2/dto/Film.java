package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Films")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	@Column(name="name")
	private String name;
	@Column(name="qualification")
	private int qualification;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Room> room;

	/**
	 * void constructor
	 */
	public Film() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param code
	 * @param name
	 * @param film
	 */
	public Film(int code, String name, int qualification) {
		super();
		this.code = code;
		this.name = name;
		this.qualification = qualification;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the qualification
	 */
	public int getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(int qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Film [code=" + code + ", name=" + name + ", qualification=" + qualification + "]";
	}
	
	



}
