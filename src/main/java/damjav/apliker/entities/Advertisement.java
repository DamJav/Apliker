package damjav.apliker.entities;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "advertisements")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String company;
    @Column(nullable = false)
    private LocalDateTime sent;
    @Column(nullable = false)
    private LocalDateTime city;
    @Column(nullable = false)
    private String answer;

}
