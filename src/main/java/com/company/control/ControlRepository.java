package com.company.control;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

//
//import org.springframework.data.repository.PagingAndSortingRepository;
//
@Repository
public interface ControlRepository extends PagingAndSortingRepository<Control, Long> {
}
