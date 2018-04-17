package org.superbiz.moviefun;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    MoviesBean moviesBean;


    public HomeController(MoviesBean moviesBean){
        this.moviesBean = moviesBean;
    }

    @GetMapping("/")
    public String index(){
       return "index";
    }

    @GetMapping("/setup")
    public String setup(Map<String, Object> model){

        model.put("movies", moviesBean.getMovies());

        return "setup";
    }
}
