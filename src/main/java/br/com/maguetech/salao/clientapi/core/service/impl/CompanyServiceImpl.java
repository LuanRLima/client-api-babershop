package br.com.maguetech.salao.clientapi.core.service.impl;


import br.com.maguetech.salao.clientapi.adpater.out.persistence.repository.CompanyRepository;
import br.com.maguetech.salao.clientapi.core.CompanyService;
import br.com.maguetech.salao.clientapi.domain.Company;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl extends GenericServiceImpl<Company, Long, CompanyRepository> implements CompanyService {
    public CompanyServiceImpl(CompanyRepository repository){ super(repository); }

    @Override
    public Company update(Long id, Company company) {
        get(id, "Company not found");
        return repository.save(company);
    }

}