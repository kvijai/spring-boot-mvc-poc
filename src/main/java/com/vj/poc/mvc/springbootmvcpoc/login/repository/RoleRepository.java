package com.vj.poc.mvc.springbootmvcpoc.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.poc.mvc.springbootmvcpoc.login.model.Role;

/**
 * @author vijai.kumar
 *
 */
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
	Role findByRole(String role);
}
