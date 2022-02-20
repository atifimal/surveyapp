package tr.com.turkreasurans.surveyapp.services;

import tr.com.turkreasurans.surveyapp.entities.QuestionOption;

import java.util.List;
import java.util.Optional;

public interface QuestionOptionService {

    Optional<QuestionOption> findById(Long id);
    List<QuestionOption> findAll();
    void delete(QuestionOption questionOption);
    void deleteById(Long id);
    void save(QuestionOption questionOption);
    void saveAll(List<QuestionOption> questionOptions);
}
