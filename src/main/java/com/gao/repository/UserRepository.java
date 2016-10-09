package com.gao.repository;

import com.gao.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by goreyjp on 16/10/9.
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
