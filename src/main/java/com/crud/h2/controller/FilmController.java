package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Film;
import com.crud.h2.service.FilmServiceImpl;

@RestController
@RequestMapping("/api")
public class FilmController {
	
	@Autowired
	FilmServiceImpl filmServiceImpl;
	 
    @RequestMapping(value = "/getAllFilms", method = RequestMethod.GET)
    public List<Film> getFilms() {
        return filmServiceImpl.getFilms();
    }

    @RequestMapping(value = "/film", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Film createFilm(@RequestBody Film film) {
        return filmServiceImpl.createFilm(film);
    }
    

}
