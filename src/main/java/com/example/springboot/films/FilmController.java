package com.example.springboot.films;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    @PostMapping("/films")
    // Not working in native
    // @ResponseStatus(HttpStatus.CREATED)
    public Long create(@RequestBody Film film) {
        return filmRepository.save(film).getId();
    }

    @GetMapping("/films/{id}")
    public Film get(@PathVariable Long id) {
        return filmRepository.getOne(id);
    }
}
