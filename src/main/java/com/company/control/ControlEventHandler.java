package com.company.control;

import com.company.user.User;
import com.company.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
@RepositoryEventHandler(Control.class)
public class ControlEventHandler {

    private final UserRepository users;

    @Autowired
    public ControlEventHandler(UserRepository users){
        this.users = users;
    }

    @HandleBeforeCreate
    @HandleBeforeSave
    public void modifyControlBasedOnLoggedInUser(Control control){
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        User user = users.findByName(username);
        control.setLastModifiedBy(user);
    }
}
