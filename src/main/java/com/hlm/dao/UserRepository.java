package com.hlm.dao;

import com.hlm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @since 2019/12/17 0017 7:06
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
