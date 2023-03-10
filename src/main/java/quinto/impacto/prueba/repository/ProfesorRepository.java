package quinto.impacto.prueba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import quinto.impacto.prueba.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

    Profesor findByNombre(String nombre);

    Profesor findByEmail(String email);
    Profesor findByEmailAndPassword(String email, String password);
    Profesor findById(int id);



}
