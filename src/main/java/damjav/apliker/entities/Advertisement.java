package damjav.apliker.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String Title;
    @Column(nullable = false)
    private String Company;
    @Column(nullable = false)
    private LocalDateTime reported;
    @Column(nullable = false)
    private String status;
   
}
