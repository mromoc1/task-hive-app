package com.hhdevs.taskhiveapp.Repositories;

import org.springframework.stereotype.Repository;

import com.hhdevs.taskhiveapp.Models.UserModel;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
    Optional<UserModel> findByUsername(String username);
}