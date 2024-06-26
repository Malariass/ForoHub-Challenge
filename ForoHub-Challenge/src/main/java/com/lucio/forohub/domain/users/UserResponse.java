package com.lucio.forohub.domain.users;

public record UserResponse(
        String username,
        String email,
        String biography
){
}
