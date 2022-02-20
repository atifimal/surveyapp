package tr.com.turkreasurans.surveyapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.turkreasurans.surveyapp.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
