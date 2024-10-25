package francescaBattistini.Esame25Ottobre.repositories;

import francescaBattistini.Esame25Ottobre.entities.Edificio;
import francescaBattistini.Esame25Ottobre.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// l'utente può prenotare dalla città la postazione

@Repository
public interface EdificioRepository extends JpaRepository<Edificio,Long> {

}
