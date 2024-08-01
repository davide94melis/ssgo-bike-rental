package com.davide94melis.ssgo.services;

import com.davide94melis.ssgo.data.Person;
import com.vaadin.hilla.Endpoint;
import com.vaadin.hilla.exception.EndpointException;
import jakarta.annotation.security.RolesAllowed;
import java.util.Optional;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Endpoint
@RolesAllowed("ADMIN")
public class SamplePersonEndpoint {

    private final SamplePersonService service;

    public SamplePersonEndpoint(SamplePersonService service) {
        this.service = service;
    }

    public Page<Person> list(Pageable page) {
        return service.list(page);
    }

    public Optional<Person> get(Long id) {
        return service.get(id);
    }

    public Person update(Person entity) {
        try {
            return service.update(entity);
        } catch (OptimisticLockingFailureException e) {
            throw new EndpointException("Somebody else has updated the data while you were making changes.");
        }
    }

    public void delete(Long id) {
        service.delete(id);
    }

    public int count() {
        return service.count();
    }

}
