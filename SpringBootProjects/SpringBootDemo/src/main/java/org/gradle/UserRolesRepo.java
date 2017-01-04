package org.gradle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRolesRepo extends JpaRepository<Roles, Long>  {
	List<Roles> findByUserId(long userId);
}
