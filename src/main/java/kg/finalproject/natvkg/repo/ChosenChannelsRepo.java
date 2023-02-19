package kg.finalproject.natvkg.repo;

import kg.finalproject.natvkg.models.ChosenChannels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChosenChannelsRepo extends JpaRepository<ChosenChannels, Long> {
}
