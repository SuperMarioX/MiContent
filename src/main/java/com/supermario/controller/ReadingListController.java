package com.supermario.controller;

import com.supermario.itf.ReadingListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Victor on 28/02/2017.
 */

@Controller
@RequestMapping("/")
public class ReadingListController {


    private ReadingListRepo readingListRepo;

    @Autowired
    public ReadingListController(ReadingListRepo readingListRepo){
        this.readingListRepo =readingListRepo;
    }

    @RequestMapping(value = "/{title}", method = RequestMethod.GET)
    public String titleBooks(@PathVariable("title") String title, Model model) {
        return "readingList test";
    }

}
