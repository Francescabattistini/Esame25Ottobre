package francescaBattistini.Esame25Ottobre.repositories;

import francescaBattistini.Esame25Ottobre.entities.Postazione;
import francescaBattistini.Esame25Ottobre.enumes.TypoPostazione;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// l'utente prenota il tipo postazione 
@Repository
public interface PostazioneRepository extends JpaRepository<Postazione, Long> {
    List<Postazione> findByTypoPostazione(TypoPostazione typoPostazione);
}
