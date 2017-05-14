package com.hackathon.techcrunch.closetapp.data.repository;

import com.hackathon.techcrunch.closetapp.data.model.Closet;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;

/**
 * Created by ANAIK on 5/13/17.
 */

public interface ClosetRepository extends CouchbasePagingAndSortingRepository<Closet, String>{

}
