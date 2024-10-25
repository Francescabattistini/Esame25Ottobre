package francescaBattistini.Esame25Ottobre.repositories;

import francescaBattistini.Esame25Ottobre.entities.Prenotazione;
import francescaBattistini.Esame25Ottobre.entities.Utente;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


//utente può prenota la data della prenotazione
@Repository

public interface PrenotazioneRepository extends JpaRepository<Prenotazione,Long> {

    List<Prenotazione> findByUtenteAndGiornoPrenotazione(Utente utente, LocalDate giornoPrenotazione  );
    boolean existByGiornoPrenotazione(LocalDate giornoPrenotazioni);
}
