package com.bbkdevelopment.hrms.core.utilities.validators;

import com.bbkdevelopment.hrms.dataAccess.abstracts.UserDao;
import com.bbkdevelopment.hrms.entities.concretes.User;

public class UserValidator {
    private User user;
    private UserDao userDao;

    public UserValidator(User user){
        this.user = user;
    }

    public UserValidator(User user, UserDao userDao){
        this(user);
        this.userDao = userDao;
    }

    public boolean isEmailUsedBefore() {
        for(User user : userDao.findAll()){
            if( user.getEmail().equals(this.user.getEmail())){
                return true;
            }
        }
        return false;
    }
}
