package org.gradle;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonRepo extends JpaRepository<Person,Long> {
}
