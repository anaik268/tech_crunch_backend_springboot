package com.hackathon.techcrunch.closetapp.data.repository;

import com.hackathon.techcrunch.closetapp.data.model.Closet;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ANAIK on 5/13/17.
 */

@Repository
public interface ClosetRepository extends CouchbasePagingAndSortingRepository<Closet, String>{

}
