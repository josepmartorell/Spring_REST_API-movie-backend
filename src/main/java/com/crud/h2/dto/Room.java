package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="room")
public class Room {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	
	@ManyToOne
    @JoinColumn(name="film_id")
    private Film film;

	/**
	 * void constructor
	 */
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param name
	 * @param film
	 */
	public Room(int id, String name, Film film) {
		super();
		this.id = id;
		this.name = name;
		this.film = film;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the film
	 */
	public Film getFilm() {
		return film;
	}

	/**
	 * @param film the film to set
	 */
	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", film=" + film + "]";
	}
	
	
	
	

}
