package com.crud.h2.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "Room")
public class Room implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(name = "Name")
    private String name;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Film film;

    public Room() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    public Film getFilm() {
        return film;
    }

    public int getFilm_Id(){
        return film.getId();
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
