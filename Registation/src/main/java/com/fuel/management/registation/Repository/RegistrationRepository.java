package com.fuel.management.registation.Repository;

import com.fuel.management.registation.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
public interface RegistrationRepository extends JpaRepository<User,Long> {
         User findByRegiNumber(String regiNumber);
}
