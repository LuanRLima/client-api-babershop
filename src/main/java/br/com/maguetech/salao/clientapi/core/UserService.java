package br.com.maguetech.salao.clientapi.core;

import br.com.maguetech.salao.clientapi.domain.User;

import java.util.List;

public interface UserService extends GenericService<User>{

    public User update(Long id, User user);

    public boolean validateCredentials(String email, String password);

}