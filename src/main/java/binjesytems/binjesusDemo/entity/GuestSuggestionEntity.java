package binjesytems.binjesusDemo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class GuestSuggestionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int rate;
    private String suggestionText;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getSuggestionText() {
        return suggestionText;
    }

    public void setSuggestionText(String suggestionText) {
        this.suggestionText = suggestionText;
    }
}
