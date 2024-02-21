package binjesytems.binjesusDemo.controller;

import binjesytems.binjesusDemo.bo.user.CreateSuggestionRequest;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import binjesytems.binjesusDemo.service.user.GuestSuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suggestions")
public class SuggestionController {

    @Autowired
    private GuestSuggestionService suggestionService;


    @GetMapping("/created")
    public List<GuestSuggestionEntity> getCreatedSuggestions() {
        return GuestSuggestionService.findAllCreatedSuggestions();
    }

    @GetMapping("/removed")
    public List<GuestSuggestionEntity> getRemovedSuggestions() {
        return GuestSuggestionService.findAllRemovedSuggestions();
    }
}