package br.com.maguetech.salao.clientapi.core;


import br.com.maguetech.salao.clientapi.domain.Company;

public interface CompanyService extends GenericService<Company>{

    public Company update(Long id, Company company);

}