package binjesytems.binjesusDemo.bo.user;

public class CreateSuggestionRequest {
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
