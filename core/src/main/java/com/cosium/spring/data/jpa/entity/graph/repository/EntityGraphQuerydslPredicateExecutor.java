package com.cosium.spring.data.jpa.entity.graph.repository;

import com.cosium.spring.data.jpa.entity.graph.domain2.EntityGraph;
import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.core.types.Predicate;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Réda Housni Alaoui
 */
@NoRepositoryBean
public interface EntityGraphQuerydslPredicateExecutor<T> extends QuerydslPredicateExecutor<T> {

  /**
   * @see QuerydslPredicateExecutor#findOne(Predicate)
   */
  default Optional<T> findOne(Predicate predicate, @Nullable EntityGraph entityGraph) {
    return findOne(predicate);
  }

  /**
   * @see QuerydslPredicateExecutor#findAll(Predicate)
   */
  default Iterable<T> findAll(Predicate predicate, @Nullable EntityGraph entityGraph) {
    return findAll(predicate);
  }

  /**
   * @see QuerydslPredicateExecutor#findAll(Predicate, Sort)
   */
  default Iterable<T> findAll(Predicate predicate, Sort sort, @Nullable EntityGraph entityGraph) {
    return findAll(predicate, sort);
  }

  /**
   * @see QuerydslPredicateExecutor#findAll(Predicate, OrderSpecifier[])
   */
  default Iterable<T> findAll(
      Predicate predicate, @Nullable EntityGraph entityGraph, OrderSpecifier<?>... orders) {
    return findAll(predicate, orders);
  }

  /**
   * @see QuerydslPredicateExecutor#findAll(OrderSpecifier[])
   */
  default Iterable<T> findAll(@Nullable EntityGraph entityGraph, OrderSpecifier<?>... orders) {
    return findAll(orders);
  }

  /**
   * @see QuerydslPredicateExecutor#findAll(Predicate, Pageable)
   */
  default Page<T> findAll(
      Predicate predicate, Pageable pageable, @Nullable EntityGraph entityGraph) {
    return findAll(predicate, pageable);
  }
}
