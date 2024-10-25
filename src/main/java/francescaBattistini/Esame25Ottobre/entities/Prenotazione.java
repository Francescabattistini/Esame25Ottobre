package francescaBattistini.Esame25Ottobre.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Long id;
    @Column(nullable = false)
    private LocalDate giornoPrenotazione;

    @ManyToOne//tante prenotazioni per un utente
    @JoinColumn(name = "id_utente")
    private Utente utente;

    @ManyToOne// tante prenotazioni per una postazione
    @JoinColumn(name = "id_postazione")
    private Postazione postazione;

    public Prenotazione(LocalDate giornoPrenotazioni) {
        this.giornoPrenotazione = giornoPrenotazioni;
    }


}
