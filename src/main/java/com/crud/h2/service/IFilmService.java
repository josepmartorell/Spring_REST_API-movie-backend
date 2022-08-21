package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Film;

public interface IFilmService {
	
	//CRUD methods
	public List<Film> listFilms(); //List All 
	
	public Film saveFilm(Film film);	//CREATE
	
	public Film filmXID(int code); //READ
	
	public Film updateFilm(Film film); //UPDATE
	
	public void eliminateFilm(int code);//DELETE

}
