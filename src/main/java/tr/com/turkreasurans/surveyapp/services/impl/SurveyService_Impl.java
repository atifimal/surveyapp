package tr.com.turkreasurans.surveyapp.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tr.com.turkreasurans.surveyapp.entities.Survey;
import tr.com.turkreasurans.surveyapp.repositories.SurveyRepository;
import tr.com.turkreasurans.surveyapp.services.SurveyService;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService_Impl implements SurveyService {
    @Autowired
    SurveyRepository surveyRepository;

    @Override
    public Optional<Survey> findById(Long id) {
        return surveyRepository.findById(id);
    }

    @Override
    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

    @Override
    public void delete(Survey survey) {
        surveyRepository.delete(survey);
    }

    @Override
    public void deleteById(Long id) {
        surveyRepository.deleteById(id);
    }

    @Override
    public void save(Survey survey) {
        surveyRepository.save(survey);
    }

    @Override
    public void saveAll(List<Survey> surveys) {
        surveyRepository.saveAll(surveys);
    }
}
