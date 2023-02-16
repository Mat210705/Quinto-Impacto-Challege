package quinto.elemento.prueba.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import quinto.elemento.prueba.model.Profesor;
import quinto.elemento.prueba.repository.ProfesorRepository;
import quinto.elemento.prueba.service.ProfesorService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProfesorServiceImpl implements ProfesorService {

    @Autowired
    ProfesorRepository profesorRepository;

    @Override
    public List<Profesor> getAllProfesor(){
        return profesorRepository.findAll();
    }

}