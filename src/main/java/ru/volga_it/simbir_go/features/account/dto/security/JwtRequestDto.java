package ru.volga_it.simbir_go.features.account.dto.security;

import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import ru.volga_it.simbir_go.common.validation.OnCreate;
import ru.volga_it.simbir_go.common.validation.OnUpdate;

public record JwtRequestDto(
        @NotNull(message = "username must be not null", groups = {OnCreate.class, OnUpdate.class})
        @Length(max = 64, message = "username must be smaller than 64 symbols", groups = {OnCreate.class, OnUpdate.class})
        String username,
        @NotNull(message = "password must be not null", groups = {OnCreate.class, OnUpdate.class})
        @Length(max = 32, message = "password must be smaller than 32 symbols", groups = {OnCreate.class, OnUpdate.class})
        String password
) {}
