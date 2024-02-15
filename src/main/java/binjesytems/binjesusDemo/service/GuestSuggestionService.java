package binjesytems.binjesusDemo.service;

import binjesytems.binjesusDemo.SuggestionProcessor;
import binjesytems.binjesusDemo.bo.user.CreateSuggestionRequest;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import binjesytems.binjesusDemo.repository.GuestSuggestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestSuggestionService {

    @Autowired
    private GuestSuggestionRepository suggestionRepository;

    public void processSuggestion(CreateSuggestionRequest request) {
        GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
        suggestionEntity.setRate(request.getRate());
        suggestionEntity.setSuggestionText(request.getSuggestionText());
        suggestionRepository.save(suggestionEntity);
    }

    // Lambda Expression
    SuggestionProcessor suggestionProcessor = (suggestionText) -> {
        GuestSuggestionEntity suggestionEntity = new GuestSuggestionEntity();
        suggestionEntity.setRate(0);
        suggestionEntity.setSuggestionText(suggestionText);
        suggestionRepository.save(suggestionEntity);
    };
}
