package ru.volga_it.simbir_go.features.account.services;

import org.springframework.data.domain.Page;
import ru.volga_it.simbir_go.features.account.entities.UserEntity;

public interface UserService {

    Page<UserEntity> getAll(Integer offset, Integer limit);

    UserEntity getById(Long id);

    UserEntity getByUsername(String username);

    UserEntity add(UserEntity user);

    void update(Long id, UserEntity user);

    void deleteById(Long id);

    void plusBalance(Long id, Double number);
}