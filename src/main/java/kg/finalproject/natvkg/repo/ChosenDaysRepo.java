package kg.finalproject.natvkg.repo;

import kg.finalproject.natvkg.models.ChosenDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChosenDaysRepo extends JpaRepository<ChosenDays, Long> {
}
