/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda;

import com.tienda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 *
 * @author Arturo
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigureAdapter {
    
    @Autowired
    private UserService UserDetailsService;
    /*
    @Bean
    Public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEnconder();
    }
    @Bean
    public UserServic getUserService(){
        return new UserService();
    }
    
   @Bean
   DaoAunthenticationProvider authenticationProvider(){
       DaoAunthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider():
       daoAunthenticationProvider.setPasswordEncoder(passwordEncoder());
       daoAunthenticationProvider.setUserDetailsService(getUserService());
       return daoAuthenticationProvider;

   }
   
   @Bean
   public AunthenticationSuccessHandler appAuthenticationSuccesHandler(){
       return new AppAuthenticationHandler();
   }
   */
   public SecurityConfig(UserService userPrincipalDetailsService){
       this.UserDetailsService = userPrincipalDetailsService;
   }
   /*
   @Override
   protected void configure(HttpSecurity http) throws Exception{
       http.authorizeRequests()
               .antMatchers("/persona","/login")
               .hasRole("ADMIN")
               .antMatchers("/personasN","/persona","/","/login")
               .hasAnyRole("USER","VENDEDOR","ADMIN")
               .anyRequest().authenticated()
               .and()
               .formLogin();
   }
   */
}
