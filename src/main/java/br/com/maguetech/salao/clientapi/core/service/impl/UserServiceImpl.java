package br.com.maguetech.salao.clientapi.core.service.impl;

import br.com.maguetech.salao.clientapi.adpater.out.persistence.repository.UserRepository;
import br.com.maguetech.salao.clientapi.core.UserService;
import br.com.maguetech.salao.clientapi.domain.User;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserServiceImpl extends GenericServiceImpl<User, Long, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository){ super(repository); }

    @Override
    public User update(Long id, User user) {
        get(id, "Company not found");
        return repository.save(user);
    }

    @Override
    public boolean validateCredentials(String email, String password) {
        Optional<User> userOptional = repository.findByEmail(email);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            return user.getPassword().equals(password);
        }
        return false;
    }

}