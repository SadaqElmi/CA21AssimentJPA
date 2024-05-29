package CA21AssimentJPA;

import jakarta.persistence.*;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "TeacherDB")
public class Teacher {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(nullable = false , length = 50)
    private  String Name;

    private  int Salary ;
    @Column(unique = true)
    private  String Tell;    
}

