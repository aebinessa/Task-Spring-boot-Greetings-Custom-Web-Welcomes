package binjesytems.binjesusDemo.repository;

import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
}
