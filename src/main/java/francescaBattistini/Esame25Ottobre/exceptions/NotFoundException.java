package francescaBattistini.Esame25Ottobre.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(Long id) {
        super("L'entità con id "+ id + "non è stata trovata");
    }
}
