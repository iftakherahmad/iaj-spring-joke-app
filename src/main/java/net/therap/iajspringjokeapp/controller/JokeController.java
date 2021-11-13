package net.therap.iajspringjokeapp.controller;

import net.therap.iajspringjokeapp.service.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author iftakhar.ahmed
 * @since 11/13/21
 */
@Controller
public class JokeController {

    JokeService jokeService;

    public JokeController(JokeService jokeService){
        this.jokeService=jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "base/index";
    }
}