package com.vjava.joke.controller;

import com.vjava.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {
    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }
}
