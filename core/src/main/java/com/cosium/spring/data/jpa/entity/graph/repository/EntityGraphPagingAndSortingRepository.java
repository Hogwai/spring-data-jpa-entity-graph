package com.cosium.spring.data.jpa.entity.graph.repository;

import com.cosium.spring.data.jpa.entity.graph.domain2.EntityGraph;
import org.jspecify.annotations.Nullable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Réda Housni Alaoui
 */
@NoRepositoryBean
public interface EntityGraphPagingAndSortingRepository<T, ID>
    extends EntityGraphRepository<T, ID>, PagingAndSortingRepository<T, ID> {

  /**
   * @see PagingAndSortingRepository#findAll(Sort)
   */
  default Iterable<T> findAll(Sort sort, @Nullable EntityGraph entityGraph) {
    return findAll(sort);
  }

  /**
   * @see PagingAndSortingRepository#findAll(Pageable)
   */
  default Page<T> findAll(Pageable pageable, @Nullable EntityGraph entityGraph) {
    return findAll(pageable);
  }
}
