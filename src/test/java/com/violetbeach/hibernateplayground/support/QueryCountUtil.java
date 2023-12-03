package com.violetbeach.hibernateplayground.support;

import jakarta.persistence.EntityManager;

public class QueryCountUtil {

    public static long getSelectQueryCount(EntityManager entityManager) {
        return entityManager.unwrap(org.hibernate.Session.class).getSessionFactory().getStatistics().getEntityLoadCount();
    }

}