package org.tdvogt.ChuckNorrisGenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.tdvogt.ChuckNorrisGenerator.model.Joke;
import org.tdvogt.ChuckNorrisGenerator.services.ChuckNorrisJokeService;

@Controller
public class JokeController {

    private final ChuckNorrisJokeService service;

    public JokeController(ChuckNorrisJokeService service) {
        this.service = service;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", service.getJoke());
        return "index";
    }

}
