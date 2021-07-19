package com.matricstream.fullstack.service;

import java.util.List;

import com.matricstream.fullstack.entity.User;
import com.matricstream.fullstack.model.SecurityUser;
import com.matricstream.fullstack.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class Details implements UserDetailsService{
    
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> user = userRepository.findByUsername(username);
        if(user == null) {
            throw new UsernameNotFoundException("User Details not found for the user " +username);
        }

        return new SecurityUser(user.get(0));
    }


}
