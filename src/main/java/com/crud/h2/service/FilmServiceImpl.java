package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFilmDAO;
import com.crud.h2.dto.Film;

@Service
public class FilmServiceImpl implements IFilmService{
	
	@Autowired
	IFilmDAO iFilmDAO;

	@Override
	public List<Film> listFilms() {
		// TODO Auto-generated method stub
		return iFilmDAO.findAll();
	}

	@Override
	public Film saveFilm(Film film) {
		// TODO Auto-generated method stub
		return iFilmDAO.save(film);
	}

	@Override
	public Film filmXID(int code) {
		// TODO Auto-generated method stub
		return iFilmDAO.findById(code).get();
	}

	@Override
	public Film updateFilm(Film film) {
		// TODO Auto-generated method stub
		return iFilmDAO.save(film);
	}

	@Override
	public void eliminateFilm(int code) {
		// TODO Auto-generated method stub
		iFilmDAO.deleteById(code);
		
	}
	
	

}
