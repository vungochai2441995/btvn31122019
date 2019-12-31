package net.vinid.dao;

import net.vinid.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersDAO extends JpaRepository<Users,Integer> {
    Users findByUsername(String username);
    Users findByEmail(String email);

}
