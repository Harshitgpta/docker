package com.nagarro.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.user.entity.Person;

@Repository
public interface UserRepository extends JpaRepository<Person,Long>{

	


	Person findByUserId(Long userId);

}
