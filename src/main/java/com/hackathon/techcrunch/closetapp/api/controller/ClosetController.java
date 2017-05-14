package com.hackathon.techcrunch.closetapp.api.controller;

import com.hackathon.techcrunch.closetapp.data.repository.ClosetRepository;
import com.hackathon.techcrunch.closetapp.domain.model.Closet;
import com.hackathon.techcrunch.closetapp.service.ClosetApp;
import com.hackathon.techcrunch.closetapp.service.ClosetAppImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ANAIK on 5/13/17.
 */

@RestController
@RequestMapping("/closet")
public class ClosetController {

    @Autowired
    private ClosetApp closetApp;

    @Autowired
    private ClosetRepository closetRepository;

//    @Autowired
//    public ClosetController(ClosetApp closetApp) {
//        this.closetApp = closetApp;
//    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Closet> getClosets() {
        List<Closet> closets = closetApp.getClosets();
        return closets;
    }


}
