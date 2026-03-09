package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;
import es.fplumara.dam1.alumnos.repository.AlumnoRepository;
import es.fplumara.dam1.alumnos.repository.CursoRepository;

import java.util.List;
import java.util.Objects;

public class CursoServiceImpl implements CursoService {
    private CursoRepository cursoRepo;

    public CursoServiceImpl(CursoRepository cursoRepo) {
        this.cursoRepo = Objects.requireNonNull(cursoRepo, "CursoRepository no puede ser null");
    }

    @Override
    public void initSchema() {
        cursoRepo.initSchema();
    }

    @Override
    public void activar(int id) {
        cursoRepo.activar(id);
    }

    @Override
    public void crearCurso(int id, String nombre, Boolean activo) {
        if(id<0 || nombre==null || activo==null){
            throw new RuntimeException("los valores deben de ser validos");
        } else cursoRepo.crearCurso(id,nombre,activo);
    }

    @Override
    public void eliminarSiNombreContiene(String nombre) {
        if(nombre==null){
            throw new RuntimeException("el nombre debe de ser valido");
        } else cursoRepo.eliminarSiNombreContiene(nombre);
    }

    @Override
    public List<Curso> listarPorEstado(boolean activo) {
        return cursoRepo.listarPorEstado(activo);
    }

    @Override
    public List<Curso> listarOrdenadoPorCampo(String campo, String tipoDeOrden) {
        if(campo==null || tipoDeOrden==null){
            throw new RuntimeException("porfavor, inserta valores validos");
        } else
        return cursoRepo.listarOrdenadoPorCampo(campo,tipoDeOrden);
    }


}
