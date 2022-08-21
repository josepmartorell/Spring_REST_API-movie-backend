package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Film;
import com.crud.h2.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	FilmServiceImpl filmServiceImpl;
	
	@GetMapping("/films")
	public List<Film> listFilms(){
		return filmServiceImpl.listFilms();
	}
	
	@PostMapping("/films")
	public Film saveFilm(@RequestBody Film film) {
		return filmServiceImpl.saveFilm(film);}
	
	@GetMapping("/films/{code}")
	public Film filmXID(@PathVariable(name="code") int code) {
		Film film_xid = new Film();
		film_xid = filmServiceImpl.filmXID(code);
		return film_xid;
	}
	
	@PutMapping("/films/{code}")
	public Film updateFilm(@PathVariable(name="code") int code, @RequestBody Film film) {
		Film selected_film = new Film();
		Film updated_film = new Film();
		
		//select the target code and then apply the getters and setters to set new values to store into updated_film instance
		selected_film = filmServiceImpl.filmXID(code);
		
		selected_film.setName(film.getName());
		selected_film.setQualification(film.getQualification());
		
		updated_film = filmServiceImpl.updateFilm(selected_film);
	
		return updated_film;
	}
	
	@DeleteMapping("/films/{id}")
	public void eliminateFilm(@PathVariable(name="code") int code) {
		filmServiceImpl.eliminateFilm(code);
	}
	
	
	
	
	
	
	
	

}
