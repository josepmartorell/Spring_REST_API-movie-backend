package com.crud.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.h2.dto.Room;

public interface IRoomDAO extends JpaRepository<Room, Integer>{

}
