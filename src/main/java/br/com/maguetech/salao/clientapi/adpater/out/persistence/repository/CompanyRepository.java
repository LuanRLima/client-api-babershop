package br.com.maguetech.salao.clientapi.adpater.out.persistence.repository;


import br.com.maguetech.salao.clientapi.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}