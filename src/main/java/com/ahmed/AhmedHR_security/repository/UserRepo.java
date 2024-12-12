package com.ahmed.AhmedHR_security.repository;

import com.ahmed.AhmedHR_security.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<AppUser, Long> {
//    Optional<AppUser> findByUserName (String userName) ;
}
