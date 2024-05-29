package CA21AssimentJPA;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    private  final  TeacherService service;

    public TeacherController(TeacherService service) {
        this.service = service;
    }

    //get all customers
    @GetMapping("/all")
    public List<Teacher> getCustomers() {
        return service.getAllCustomers();
    }


    @PostMapping
    public void createCustomer(@RequestBody Teacher teacher) {
        service.addCustomer(teacher);
    }
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
    }
}
