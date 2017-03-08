/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biblio.auth.server;


import com.biblio.auth.server.reposotory.RoleRepository;
import com.biblio.auth.server.reposotory.UserRepository;
import java.util.Date;
import javax.inject.Inject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 *
 * @author kouwonou
 */
@Configuration
public class Beans {
    @Inject
    private RoleRepository roleRepository;
    @Inject
    private UserRepository userRepository;
    @Bean
    public JavaMailSenderImpl javaMailSenderImpl(){
        return new JavaMailSenderImpl();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return  new BCryptPasswordEncoder();
    }
    
   
}