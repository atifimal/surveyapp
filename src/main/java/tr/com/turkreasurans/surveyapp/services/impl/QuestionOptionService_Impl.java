package tr.com.turkreasurans.surveyapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.turkreasurans.surveyapp.entities.QuestionOption;
import tr.com.turkreasurans.surveyapp.repositories.QuestionOptionRepository;
import tr.com.turkreasurans.surveyapp.services.QuestionOptionService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionOptionService_Impl  implements QuestionOptionService {

    @Autowired
    QuestionOptionRepository questionOptionRepository;

    @Override
    public Optional<QuestionOption> findById(Long id) {
        return questionOptionRepository.findById(id);
    }

    @Override
    public List<QuestionOption> findAll() {
        return questionOptionRepository.findAll();
    }

    @Override
    public void delete(QuestionOption questionOption) {
        questionOptionRepository.delete(questionOption);
    }

    @Override
    public void deleteById(Long id) {
        questionOptionRepository.deleteById(id);
    }

    @Override
    public void save(QuestionOption questionOption) {
        questionOptionRepository.save(questionOption);
    }

    @Override
    public void saveAll(List<QuestionOption> questionOptions) {
        questionOptionRepository.saveAll(questionOptions);
    }
}
