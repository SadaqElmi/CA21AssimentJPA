package CA21AssimentJPA;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService {
    private  final  TeacherRespository teacherRespository;

    public TeacherService(TeacherRespository teacherRespository) {
        this.teacherRespository = teacherRespository;
    }

    // addTeacher
    public void addCustomer(Teacher teacher) {
        teacherRespository.save(teacher);
    }
    //delete
    public void deleteCustomer(int id) {
        teacherRespository.deleteById(id);
    }
    //get all customers
    public List<Teacher> getAllCustomers() {
        return teacherRespository.findAll();
    }

}
