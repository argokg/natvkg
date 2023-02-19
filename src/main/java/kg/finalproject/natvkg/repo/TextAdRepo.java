package kg.finalproject.natvkg.repo;

import kg.finalproject.natvkg.models.TextAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextAdRepo extends JpaRepository<TextAd, Long> {
}
