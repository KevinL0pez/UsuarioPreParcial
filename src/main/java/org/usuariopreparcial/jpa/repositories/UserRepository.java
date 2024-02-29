package org.usuariopreparcial.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.usuariopreparcial.jpa.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
