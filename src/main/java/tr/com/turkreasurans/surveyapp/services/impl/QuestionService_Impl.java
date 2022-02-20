package tr.com.turkreasurans.surveyapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.turkreasurans.surveyapp.entities.Question;
import tr.com.turkreasurans.surveyapp.repositories.QuestionRepository;
import tr.com.turkreasurans.surveyapp.services.QuestionService;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService_Impl implements QuestionService {
    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public void delete(Question question) {
        questionRepository.delete(question);
    }

    @Override
    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }

    @Override
    public void save(Question question) {
        questionRepository.save(question);
    }

    @Override
    public void saveAll(List<Question> questions) {
        questionRepository.saveAll(questions);
    }
}
