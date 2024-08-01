package com.davide94melis.ssgo.data;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PersonRepository
        extends
            JpaRepository<Person, Long>,
            JpaSpecificationExecutor<Person> {

}
