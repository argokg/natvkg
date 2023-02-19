package kg.finalproject.natvkg.repo;

import kg.finalproject.natvkg.models.Channels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelsRepo extends JpaRepository<Channels, Long> {
}
