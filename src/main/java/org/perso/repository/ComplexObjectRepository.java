package org.perso.repository;

import org.perso.model.entity.ComplexObjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexObjectRepository extends JpaRepository<ComplexObjectEntity, Integer> {
}
