package quinto.elemento.prueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import quinto.elemento.prueba.dto.CursoDTO;
import quinto.elemento.prueba.dto.ProfesorDTO;
import quinto.elemento.prueba.model.Curso;
import quinto.elemento.prueba.model.Profesor;
import quinto.elemento.prueba.service.CursoService;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class CursoController {
    @Autowired
    CursoService cursoService;

    @GetMapping(path = "/cursos")
    public List<Curso> getAllCursos(){
        return cursoService.getAllCursos();
    }

    @GetMapping(path = "/curso{nombre}")
    public Curso getCursoByName(@RequestParam String nombre){
        return cursoService.getCursoByName(nombre);
    }

    @PostMapping(path = "/crear/curso")
    public ResponseEntity<?> createCurso(@RequestBody CursoDTO cursoDTO){
        return cursoService.crearCurso(cursoDTO);
    }
    @PutMapping(path = "/editar/curso")
    public ResponseEntity<?> editarCurso(@RequestParam int id,@RequestBody CursoDTO cursoDTO){
        return cursoService.editarCurso(id, cursoDTO);
    }
    @DeleteMapping(path = "/eliminar/curso")
    public ResponseEntity<?> eliminarCurso(@RequestParam int id){
        return cursoService.eliminarCurso(id);
    }


}