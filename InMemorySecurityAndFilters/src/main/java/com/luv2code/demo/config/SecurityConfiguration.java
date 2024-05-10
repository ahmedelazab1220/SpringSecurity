package com.luv2code.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.csrf(csrf -> csrf.disable()).authorizeHttpRequests(request -> {
			request.requestMatchers("/api/v1/auth").permitAll();
			request.requestMatchers("/api/v1/auth/admin").hasRole("ADMIN");
			request.requestMatchers("/api/v1/auth/user").hasRole("USER");
			request.requestMatchers("/api/v1/auth/root").hasAnyRole("ADMIN", "USER");
			request.anyRequest().authenticated();
		}).httpBasic(Customizer.withDefaults())
		  .formLogin(form -> form.permitAll());

		return http.build();
	}

	@Bean
	UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder()
				.username("ahmed")
				.password(passwordEncoder().encode("123"))
				.roles("USER")
				.build();

		UserDetails user2 = User.builder()
				.username("john")
				.password(passwordEncoder().encode("123"))
				.authorities("WRITE")
				.roles("ADMIN")
				.build();
		
		UserDetails user3 = User.builder()
				.username("ali")
				.password(passwordEncoder().encode("123"))
				.authorities("READ")
				.roles("ADMIN" , "USER")
				.build();

		return new InMemoryUserDetailsManager(user1, user2 , user3);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
