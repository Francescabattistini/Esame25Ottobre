package francescaBattistini.Esame25Ottobre.repositories;

import francescaBattistini.Esame25Ottobre.entities.Utente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
// trovo l'utente
@Repository
public interface UtenteRepository extends JpaRepository<Utente,Long> {

     boolean existsByEmail(String email);
}
