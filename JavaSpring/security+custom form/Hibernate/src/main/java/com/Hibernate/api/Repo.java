package com.Hibernate.api;

import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<User, Integer>{

	Optional<User>findByUserName(String username);
}
