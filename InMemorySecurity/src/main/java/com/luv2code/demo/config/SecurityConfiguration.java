package com.luv2code.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SecurityConfiguration {

	@Bean
	UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder().username("ahmed").password(passwordEncoder().encode("123")).roles("USER")
				.build();

		UserDetails user2 = User.builder().username("john").password(passwordEncoder().encode("123")).roles("USER")
				.build();

		return new InMemoryUserDetailsManager(user1, user2);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
