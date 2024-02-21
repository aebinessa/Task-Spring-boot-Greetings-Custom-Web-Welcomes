package binjesytems.binjesusDemo.test;

import binjesytems.binjesusDemo.Enums.SuggestionStatus;
import binjesytems.binjesusDemo.entity.GuestSuggestionEntity;
import binjesytems.binjesusDemo.repository.GuestSuggestionRepository;
import binjesytems.binjesusDemo.service.user.GuestSuggestionServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)

public class GuestSuggestionServiceTest {
    @Mock
    private GuestSuggestionRepository suggestionRepository;

    @InjectMocks
    private GuestSuggestionServiceImpl suggestionService;

    private List<GuestSuggestionEntity> mockSuggestions;

    @Before
    public void setUp() {
        mockSuggestions = Arrays.asList(
                new GuestSuggestionEntity(SuggestionStatus.CREATE),
                new GuestSuggestionEntity(SuggestionStatus.REMOVE),
                new GuestSuggestionEntity(SuggestionStatus.CREATE)
        );
    }

    @Test
    public void whenGetCreateStatusSuggestions_thenSuccess() {
        when(suggestionRepository.findByStatus(SuggestionStatus.CREATE)).thenReturn(Arrays.asList(mockSuggestions.get(0), mockSuggestions.get(2)));

        List<GuestSuggestionEntity> createStatusSuggestions = suggestionService.findAllCreatedSuggestions();

        Assert.assertEquals(2, createStatusSuggestions.size());
        Assert.assertTrue(createStatusSuggestions.stream().allMatch(s -> s.getStatus() == SuggestionStatus.CREATE));
    }

    @Test
    public void whenGetRemoveStatusSuggestions_thenSuccess() {
        when(suggestionRepository.findByStatus(SuggestionStatus.REMOVE)).thenReturn(Arrays.asList(mockSuggestions.get(1)));

        List<GuestSuggestionEntity> removeStatusSuggestions = suggestionService.findAllRemovedSuggestions();

        Assert.assertEquals(1, removeStatusSuggestions.size());
        Assert.assertTrue(removeStatusSuggestions.stream().allMatch(s -> s.getStatus() == SuggestionStatus.REMOVE));
    }


}
