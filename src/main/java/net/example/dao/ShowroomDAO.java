package net.example.dao;

import net.example.entity.Showroom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowroomDAO extends JpaRepository<Showroom,Long> {
        @Query("SELECT u.location FROM showroom u")
        public List<String> findDistinct();
}
