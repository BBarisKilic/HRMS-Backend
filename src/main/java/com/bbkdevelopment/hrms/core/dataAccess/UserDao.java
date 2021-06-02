package com.bbkdevelopment.hrms.core.dataAccess;

import com.bbkdevelopment.hrms.core.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
