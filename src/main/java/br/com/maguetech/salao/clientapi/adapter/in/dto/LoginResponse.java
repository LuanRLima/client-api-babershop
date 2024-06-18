package br.com.maguetech.salao.clientapi.adapters.in.dto;

public record LoginResponse(String token, Long expiresIn) {
}

