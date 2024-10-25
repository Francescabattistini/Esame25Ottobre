package francescaBattistini.Esame25Ottobre.repositories;
import francescaBattistini.Esame25Ottobre.entities.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
// l'utente può prenotare dalla città la postazione

@Repository
public interface EdificioRepository extends JpaRepository<Edificio,Long> {
    boolean existsByCitta(String citta);

}
