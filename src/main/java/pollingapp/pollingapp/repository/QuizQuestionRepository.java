package pollingapp.pollingapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pollingapp.pollingapp.entity.Quiz;
import pollingapp.pollingapp.entity.QuizQuestion;
public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long>{
    public List<QuizQuestion> findByQuiz(Quiz quiz);
}
