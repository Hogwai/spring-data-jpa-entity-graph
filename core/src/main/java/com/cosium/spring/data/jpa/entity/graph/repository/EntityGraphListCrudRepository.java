package com.cosium.spring.data.jpa.entity.graph.repository;

import com.cosium.spring.data.jpa.entity.graph.domain2.EntityGraph;
import java.util.List;
import org.jspecify.annotations.Nullable;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Réda Housni Alaoui
 */
@NoRepositoryBean
public interface EntityGraphListCrudRepository<T, ID>
    extends EntityGraphCrudRepository<T, ID>, ListCrudRepository<T, ID> {

  /**
   * @see ListCrudRepository#findAll()
   */
  @Override
  default List<T> findAll(@Nullable EntityGraph entityGraph) {
    return findAll();
  }

  /**
   * @see ListCrudRepository#findAllById(Iterable)
   */
  @Override
  default List<T> findAllById(Iterable<ID> ids, @Nullable EntityGraph entityGraph) {
    return findAllById(ids);
  }
}
