package francescaBattistini.Esame25Ottobre.entities;

import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.service.spi.InjectService;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "postazione")
public class Postazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private String descrizione;
    @Column(nullable = false)
    private TypoPostazione typopostazione;
    @Column(nullable = false)
    private int numeroMaxPartecipanti;

    public Postazione(String descrizione, TypoPostazione typopostazione, int numeroMaxPartecipanti) {
        this.descrizione = descrizione;
        this.typopostazione = typopostazione;
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
    }
}
