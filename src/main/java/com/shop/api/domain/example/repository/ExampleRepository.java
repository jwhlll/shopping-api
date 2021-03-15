package com.shop.api.domain.example.repository;

import com.shop.api.domain.example.entiry.Example;
import com.shop.api.infrastructure.repository.example.ExampleRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * Example Repository
 * @author openit
 */
@Repository
public interface ExampleRepository extends JpaRepository<Example, Long>, ExampleRepositoryCustom, QuerydslPredicateExecutor<Example> {

}
