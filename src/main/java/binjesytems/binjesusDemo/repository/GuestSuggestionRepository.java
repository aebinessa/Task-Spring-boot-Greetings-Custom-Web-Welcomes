package binjesytems.binjesusDemo.repository;

import binjesytems.binjesusDemo.Enums.SuggestionStatus;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestSuggestionRepository extends JpaRepository<GuestSuggestionEntity, Long> {
    List<GuestSuggestionEntity> findByStatus(SuggestionStatus status);

}
