package br.com.maguetech.salao.clientapi.adpater.out.persistence.repository;


import br.com.maguetech.salao.clientapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}