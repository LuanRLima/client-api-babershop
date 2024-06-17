package br.com.maguetech.salao.clientapi.adapter.in.controller;


import br.com.maguetech.salao.clientapi.adapter.in.dto.LoginRequest;
import br.com.maguetech.salao.clientapi.adapters.in.dto.LoginResponse;
import br.com.maguetech.salao.clientapi.core.UserService;
import br.com.maguetech.salao.clientapi.domain.Role;
import br.com.maguetech.salao.clientapi.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.stream.Collectors;


@RestController
@RequestMapping("api/auth")
public class AuthController extends GenericController<User>{
    public AuthController(UserService service){ super(service); }

    @Autowired
    private UserService userService;


//
//    @PostMapping("/login")
//    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest loginRequest) {
//        var usuario = userService.findByEmail(loginRequest.email());
//
//        if (usuario == null || !passwordEncoder.matches(loginRequest.password(), usuario.getPassword())) {
//            throw new BadCredentialsException("Usuário ou senha inválidos!");
//        }
//
//        var agora = Instant.now();
//        var expiraEm = 300L;
//
//        var escopos = usuario.getRoles()
//                .stream()
//                .map(Role::getName)
//                .collect(Collectors.joining(" "));
//
//        var claims = JwtClaimsSet.builder()
//                .issuer("meubackend")
//                .subject(usuario.getId().toString())
//                .issuedAt(agora)
//                .expiresAt(agora.plusSeconds(expiraEm))
//                .claim("scope", escopos)
//                .build();
//
//        var jwtValor = jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
//
//        return ResponseEntity.ok(new LoginResponse(jwtValor, expiraEm));
//    }

    @GetMapping("/login")
    public ResponseEntity<Boolean> login(@RequestParam String email, @RequestParam String password) {
        if (!userService.validateCredentials(email, password)) {
            return ResponseEntity.ok(false);
        }
        return ResponseEntity.ok(true);
    }
}


