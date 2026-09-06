package com.cosium.spring.data.jpa.entity.graph.repository;

import com.cosium.spring.data.jpa.entity.graph.domain2.EntityGraph;
import java.util.Optional;
import org.jspecify.annotations.Nullable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author Réda Housni Alaoui
 */
@NoRepositoryBean
public interface EntityGraphCrudRepository<T, ID>
    extends EntityGraphRepository<T, ID>, CrudRepository<T, ID> {

  /**
   * @see CrudRepository#findById(Object)
   */
  default Optional<T> findById(ID id, @Nullable EntityGraph entityGraph) {
    return findById(id);
  }

  /**
   * @see CrudRepository#findAll()
   */
  default Iterable<T> findAll(@Nullable EntityGraph entityGraph) {
    return findAll();
  }

  /**
   * @see CrudRepository#findAllById(Iterable)
   */
  default Iterable<T> findAllById(Iterable<ID> ids, @Nullable EntityGraph entityGraph) {
    return findAllById(ids);
  }
}
