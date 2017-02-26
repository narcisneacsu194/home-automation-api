package com.company.room;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
//import org.springframework.security.access.prepost.PreAuthorize;

public interface RoomRepository extends CrudRepository<Room, Long> {
//    @Override
//    @PreAuthorize("hasRole('ROLE_ADMIN')")
//    Room save(Room entity);
}
