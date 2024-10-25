package francescaBattistini.Esame25Ottobre.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    private String username;
    @Column(nullable = false)
    private String nomeCognome;
    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "utente")// un utente può avere tante postazioni
   // @ToString.Exclude
    List<Prenotazione> prenotazioni;



    public Utente(String username, String nomeCognome, String email) {
        this.username = username;
        this.nomeCognome = nomeCognome;
        this.email = email;
    }
}
