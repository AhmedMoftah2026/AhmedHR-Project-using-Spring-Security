package com.ahmed.AhmedHR_security.repository;

import com.ahmed.AhmedHR_security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName (String name);
}
