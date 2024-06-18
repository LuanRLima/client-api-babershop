package br.com.maguetech.salao.clientapi.adpater.out.persistence.repository;

import br.com.maguetech.salao.clientapi.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}