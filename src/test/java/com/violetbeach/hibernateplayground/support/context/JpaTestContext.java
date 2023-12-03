package com.violetbeach.hibernateplayground.support.context;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class JpaTestContext {
    @PersistenceContext
    protected EntityManager em;
}
