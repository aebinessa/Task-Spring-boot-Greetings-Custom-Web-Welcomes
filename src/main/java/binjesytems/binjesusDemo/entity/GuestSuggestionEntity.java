package binjesytems.binjesusDemo.entity;

import binjesytems.binjesusDemo.Enums.SuggestionStatus;

import javax.persistence.*;

@Entity
@Table(name = "guest")
public class GuestSuggestionEntity {

    @Id
    @Column(nullable = false)
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

    @Enumerated(EnumType.STRING)
    private SuggestionStatus status;

    public SuggestionStatus getStatus() {
        return status;
    }

    public void setStatus(SuggestionStatus status) {
        this.status = status;
    }

    public GuestSuggestionEntity(SuggestionStatus remove) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}


