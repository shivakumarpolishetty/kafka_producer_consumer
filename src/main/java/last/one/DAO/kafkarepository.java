package last.one.DAO;

import last.one.Entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface kafkarepository extends JpaRepository<Data,Integer> {

}
