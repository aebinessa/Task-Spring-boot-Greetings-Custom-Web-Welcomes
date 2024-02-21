package binjesytems.binjesusDemo.service.user;

import binjesytems.binjesusDemo.Enums.SuggestionStatus;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import binjesytems.binjesusDemo.repository.GuestSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestSuggestionServiceImpl implements GuestSuggestionService {

    @Autowired
    private GuestSuggestionRepository suggestionRepository;

    @Override
    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return suggestionRepository.findByStatus(SuggestionStatus.CREATE);
    }

    @Override
    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return suggestionRepository.findByStatus(SuggestionStatus.REMOVE);
    }
}
