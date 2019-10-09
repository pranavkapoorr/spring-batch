package com.pranavkapoorr.mybatch.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pranavkapoorr.mybatch.user.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
