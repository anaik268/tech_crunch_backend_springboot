package com.hackathon.techcrunch.closetapp.api.controller;

import com.hackathon.techcrunch.closetapp.data.repository.ClosetRepository;
import com.hackathon.techcrunch.closetapp.domain.model.Closet;
import com.hackathon.techcrunch.closetapp.service.ClosetServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAIK on 5/13/17.
 */

@RestController
@RequestMapping("/closet")
public class ClosetController {

    private final ClosetServiceImpl closetServiceImpl;

    private final ClosetRepository closetRepository;

    @Autowired
    public ClosetController(ClosetServiceImpl closetServiceImpl, ClosetRepository closetRepository) {
        this.closetServiceImpl = closetServiceImpl;
        this.closetRepository = closetRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Closet> getClosets() {
        List<Closet> closets = new ArrayList<>();
        closets.add(new Closet("1", "name1"));
        closets.add(new Closet("2", "name2"));
        return closets;
    }


}
