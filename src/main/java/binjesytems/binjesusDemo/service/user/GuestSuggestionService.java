package binjesytems.binjesusDemo.service.user;

import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;

import java.util.List;

public interface GuestSuggestionService {
    static List<GuestSuggestionEntity> findAllCreatedSuggestions();
    static List<GuestSuggestionEntity> findAllRemovedSuggestions();
}
