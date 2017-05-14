package com.hackathon.techcrunch.closetapp.service;

import com.hackathon.techcrunch.closetapp.domain.model.Closet;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ANAIK on 5/13/17.
 */

public interface ClosetApp {
    public void addCloset(Closet closet);
    public List<Closet> getClosets();
}
