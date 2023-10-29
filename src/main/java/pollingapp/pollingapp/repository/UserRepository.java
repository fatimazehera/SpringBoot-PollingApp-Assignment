package pollingapp.pollingapp.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pollingapp.pollingapp.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Long> {
    public List<Users> findByUsername(String username);
}
