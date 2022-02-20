package tr.com.turkreasurans.surveyapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import tr.com.turkreasurans.surveyapp.entities.Survey;
import tr.com.turkreasurans.surveyapp.services.QuestionOptionService;
import tr.com.turkreasurans.surveyapp.services.SurveyService;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/get")
    public ModelAndView get() {
        Map<String, Object> map = new LinkedHashMap<>();
        if(surveyService.findById(1L).isPresent()) map.put("survey_id_1", surveyService.findById(1L).get());
        else map.put("survey_id_1", new Survey());
        return new ModelAndView("index", map);

    }
}
