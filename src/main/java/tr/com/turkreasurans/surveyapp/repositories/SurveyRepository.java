package tr.com.turkreasurans.surveyapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.turkreasurans.surveyapp.entities.Survey;

@Repository
public interface SurveyRepository extends JpaRepository<Survey, Long> {
}
