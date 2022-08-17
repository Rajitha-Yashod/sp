package com.fuel.management.registation.Service;

import com.fuel.management.registation.Model.User;
import com.fuel.management.registation.Repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository repo;

    public User savaUser(User user){
      return repo.save(user);
    }

   public User fetchUserByRegistrationNumber(String regiNumber){
    return repo.findByRegiNumber(regiNumber);
    }



}
