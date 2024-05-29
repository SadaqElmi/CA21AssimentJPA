package CA21AssimentJPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRespository  extends JpaRepository <Teacher ,Integer> {
}
