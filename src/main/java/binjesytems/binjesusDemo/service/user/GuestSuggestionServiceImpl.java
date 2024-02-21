package binjesytems.binjesusDemo.service.user;

import binjesytems.binjesusDemo.Enums.SuggestionStatus;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import binjesytems.binjesusDemo.repository.GuestSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GuestSuggestionServiceImpl implements GuestSuggestionService {

    @Autowired
    private GuestSuggestionRepository suggestionRepository;

    @Override
    public List<GuestSuggestionEntity> findAllCreatedSuggestions() {
        return suggestionRepository.findAll().stream()
                .filter(s -> s.getStatus() == SuggestionStatus.CREATE)
                .collect(Collectors.toList());
    }

    @Override
    public List<GuestSuggestionEntity> findAllRemovedSuggestions() {
        return suggestionRepository.findAll().stream()
                .filter(s -> s.getStatus() == SuggestionStatus.REMOVE)
                .collect(Collectors.toList());
    }
}
