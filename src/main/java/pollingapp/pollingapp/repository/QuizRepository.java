package pollingapp.pollingapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pollingapp.pollingapp.entity.Quiz;
@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
