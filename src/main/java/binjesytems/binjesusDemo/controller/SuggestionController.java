package binjesytems.binjesusDemo.controller;

import binjesytems.binjesusDemo.bo.user.CreateSuggestionRequest;
import binjesytems.binjesusDemo.service.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionController {

    @Autowired
    private GuestSuggestionService suggestionService;

    @PostMapping("/api/suggestions")
    public String receiveAndProcessSuggestion(@RequestBody CreateSuggestionRequest request) {
        suggestionService.processSuggestion(request);
        return "Suggestion received";
    }
}