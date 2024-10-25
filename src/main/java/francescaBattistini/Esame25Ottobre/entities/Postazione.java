package francescaBattistini.Esame25Ottobre.entities;

import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.service.spi.InjectService;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private TypoPostazione typoPostazione;
    @Column(nullable = false)
    private int numeroMaxPartecipanti;

    @ManyToOne// tante postazioni per un edificio
    @JoinColumn(name = "id_edificio")
    private Edificio edificio;

    @OneToMany(mappedBy = "postazione")// una postazione per tante prenotazioni
    @ToString.Exclude
    private List<Prenotazione> prenotazioni;



    public Postazione(String descrizione, TypoPostazione typopostazione, int numeroMaxPartecipanti) {
        this.descrizione = descrizione;
        this.typoPostazione = typopostazione;
        this.numeroMaxPartecipanti = numeroMaxPartecipanti;
    }

}
