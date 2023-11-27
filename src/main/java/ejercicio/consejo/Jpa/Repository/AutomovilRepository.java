package ejercicio.consejo.Jpa.Repository;

import ejercicio.consejo.Jpa.Entity.Automovil;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutomovilRepository extends JpaRepository<Automovil, Long> {
    List<Automovil> findByMarcaAndTipo(String marca, String tipo);
}