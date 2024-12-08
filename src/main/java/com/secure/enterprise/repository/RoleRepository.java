package com.secure.enterprise.repository;


import com.secure.enterprise.model.AppRole;
import com.secure.enterprise.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}