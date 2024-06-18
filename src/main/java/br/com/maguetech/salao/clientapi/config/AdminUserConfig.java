package br.com.maguetech.salao.clientapi.config;

import br.com.maguetech.salao.clientapi.adpater.out.persistence.repository.RoleRepository;
import br.com.maguetech.salao.clientapi.adpater.out.persistence.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;


import java.util.Set;

@Configuration
public class AdminUserConfig {

//    private RoleRepository roleRepository;
//    private UserRepository userRepository;
//    private BCryptPasswordEncoder passwordEncoder;
//
//    public AdminUserConfig(RoleRepository roleRepository,
//                           UserRepository userRepository,
//                           BCryptPasswordEncoder passwordEncoder) {
//        this.roleRepository = roleRepository;
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//    }
//
//    @Override
//    @Transactional
//    public void run(String... args) throws Exception {
//
//        var roleAdmin = roleRepository.findByName(Role.Values.ADMIN.name());
//
//        var userAdmin = userRepository.findByUsername("admin");
//
//        userAdmin.ifPresentOrElse(
//                user -> {
//                    System.out.println("admin ja existe");
//                },
//                () -> {
//                    var user = new User();
//                    user.setUsername("admin");
//                    user.setPassword(passwordEncoder.encode("123"));
//                    user.setRoles(Set.of(roleAdmin));
//                    userRepository.save(user);
//                }
//        );
//    }
}