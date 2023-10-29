package pollingapp.pollingapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pollingapp.pollingapp.entity.UserAnswers;
@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswers, Long>{
}
