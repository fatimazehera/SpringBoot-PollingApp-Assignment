package pollingapp.pollingapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pollingapp.pollingapp.entity.Questions;
@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
}
