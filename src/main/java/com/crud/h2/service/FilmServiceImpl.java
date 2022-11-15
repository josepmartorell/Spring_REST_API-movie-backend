package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFilmDAO;
import com.crud.h2.dto.Film;

@Service
public class FilmServiceImpl{
	
	@Autowired
	IFilmDAO iFilmDAO;
	
    public List<Film> getFilms() {
    	return iFilmDAO.findAll();
	}
    

    public Film createFilm(Film film) {
		return iFilmDAO.save(film);
    }
	


}
