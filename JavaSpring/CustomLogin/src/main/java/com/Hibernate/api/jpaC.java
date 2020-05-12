package com.Hibernate.api;

import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jpaC extends JpaRepository<model, Long>  
{
}
