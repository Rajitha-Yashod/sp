package com.fuel.management.registation.Controller;

import com.fuel.management.registation.Model.User;
import com.fuel.management.registation.Repository.RegistrationRepository;
import com.fuel.management.registation.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v")
public class RegistationController {

    @Autowired
    private RegistrationService service;
    @PostMapping(path = "/users")
    public User registerUser(@RequestBody User user) throws Exception {
       String tempRegNumber= user.getRegistrationNumber();
        if(tempRegNumber !=null && "".equals(tempRegNumber)){
           User userObj= service.fetchUserByRegistrationNumber(tempRegNumber);
           if(userObj !=null){
               throw new Exception("User with "+tempRegNumber+"is already exist");
           }
        }
        User userObj =null;
        userObj=service.savaUser(user);
        return userObj;

    }



}
