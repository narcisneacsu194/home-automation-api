package com.company.room;

import com.company.user.User;
import com.company.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Room.class)
public class RoomHandler {
    private final UserRepository users;

    @Autowired
    public RoomHandler(UserRepository users){
        this.users = users;
    }

    @HandleBeforeCreate
    @HandleBeforeSave
    public void createRoomOnlyIfUserIsAdmin(Room room){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = users.findByName(username);
        if(!user.hasRole("ROLE_ADMIN")){
            throw new AccessDeniedException("You do not have authorization to create a room.");
        }
    }
}
