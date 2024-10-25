package francescaBattistini.Esame25Ottobre.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Utente")
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String nomeCognome;
    @Column(nullable = false)
    private String email;

    public Utente(String userName, String nomeCognome, String email) {
        this.userName = userName;
        this.nomeCognome = nomeCognome;
        this.email = email;
    }
}
