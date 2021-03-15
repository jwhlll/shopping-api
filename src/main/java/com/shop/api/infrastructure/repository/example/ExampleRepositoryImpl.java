package com.shop.api.infrastructure.repository.example;

import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

/**
 * Example Custom Repository 구현
 * @author
 */
@RequiredArgsConstructor
public class ExampleRepositoryImpl implements ExampleRepositoryCustom {
    private final JPAQueryFactory queryFactory;

//    @Override
//    public void search() {
//        queryFactory
//                .selectFrom(example)
//                .fetch();
//    }
}
