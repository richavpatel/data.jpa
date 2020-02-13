package com.richa.data.jpa.controller;

import com.richa.data.jpa.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieController {

    @GetMapping("/{movieId}")
    public Movie getAllMovie(@PathVariable int movieId){
        return new Movie(movieId, "DDD");

    }


}
