package com.hackathon.techcrunch.closetapp.service;

import com.hackathon.techcrunch.closetapp.data.repository.ClosetRepository;
import com.hackathon.techcrunch.closetapp.domain.model.Closet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANAIK on 5/13/17.
 */

@Service
public class ClosetAppImpl implements ClosetApp{

    public final ClosetRepository closetRepository;

    @Autowired
    public ClosetAppImpl(ClosetRepository closetRepository) {
        this.closetRepository = closetRepository;
    }

    @Override
    public void addCloset(Closet closet) {
//        closetRepository.save(closet);
    }

    @Override
    public List<Closet> getClosets() {
        List<Closet> listOfClosets = new ArrayList<>();
        listOfClosets.add(new Closet("1", "closet2"));
        listOfClosets.add(new Closet("2", "closet2"));

        return listOfClosets;

    }
}
