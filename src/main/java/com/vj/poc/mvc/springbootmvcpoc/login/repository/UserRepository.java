package com.vj.poc.mvc.springbootmvcpoc.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vj.poc.mvc.springbootmvcpoc.login.model.User;

/**
 * @author vijai.kumar
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
