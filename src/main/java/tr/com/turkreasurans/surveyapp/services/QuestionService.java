package tr.com.turkreasurans.surveyapp.services;

import tr.com.turkreasurans.surveyapp.entities.Question;
import tr.com.turkreasurans.surveyapp.entities.QuestionOption;

import java.util.List;
import java.util.Optional;

public interface QuestionService {
    Optional<Question> findById(Long id);
    List<Question> findAll();
    void delete(Question questionOption);
    void deleteById(Long id);
    void save(Question questionOption);
    void saveAll(List<Question> questionOptions);
}
