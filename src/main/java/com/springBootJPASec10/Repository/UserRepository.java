package com.springBootJPASec10.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springBootJPASec10.Enitity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	

}

// this will extends jpaRepository there we will pass user entity and PK 
// userRepository interface will get crud methods to perform crud DB for this User jpa entity entity 
// we need to pass Entity and the type of the primary key
