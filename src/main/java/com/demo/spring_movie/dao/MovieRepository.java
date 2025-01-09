package com.demo.spring_movie.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring_movie.dao.entity.MovieEntity;

public interface MovieRepository extends JpaRepository<MovieEntity, Integer> {

}
