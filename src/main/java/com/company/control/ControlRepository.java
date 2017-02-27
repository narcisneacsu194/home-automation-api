package com.company.control;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControlRepository extends PagingAndSortingRepository<Control, Long> {
}
