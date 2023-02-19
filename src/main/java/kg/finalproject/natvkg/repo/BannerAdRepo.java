package kg.finalproject.natvkg.repo;

import kg.finalproject.natvkg.models.BannerAd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerAdRepo extends JpaRepository<BannerAd, Long> {
}
