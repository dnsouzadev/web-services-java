package com.dnsouzadev.webservice.repositories;

import com.dnsouzadev.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
