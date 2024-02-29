package org.usuariopreparcial.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.usuariopreparcial.jpa.entities.RolEntity;

@Repository
public interface RolRepository extends JpaRepository<RolEntity, Long> {
}
