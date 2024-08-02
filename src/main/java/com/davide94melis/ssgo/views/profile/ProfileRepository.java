package com.davide94melis.ssgo.views.profile;

import com.davide94melis.ssgo.data.Person;
import com.davide94melis.ssgo.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProfileRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

    User findByUsername(String username);

}

