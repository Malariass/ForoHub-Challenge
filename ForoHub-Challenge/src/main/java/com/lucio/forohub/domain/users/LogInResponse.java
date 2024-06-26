package com.lucio.forohub.domain.users;

public record LogInResponse(
        String token,
        long expiresIn
) {
}
