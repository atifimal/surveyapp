package tr.com.turkreasurans.surveyapp.services;

import tr.com.turkreasurans.surveyapp.entities.QuestionOption;
import tr.com.turkreasurans.surveyapp.entities.Survey;

import java.util.List;
import java.util.Optional;

public interface SurveyService {
    Optional<Survey> findById(Long id);
    List<Survey> findAll();
    void delete(Survey questionOption);
    void deleteById(Long id);
    void save(Survey questionOption);
    void saveAll(List<Survey> questionOptions);
}
