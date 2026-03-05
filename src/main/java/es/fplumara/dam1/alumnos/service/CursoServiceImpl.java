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
    public void eliminarSiNombreContiene(String nombre) {
        cursoRepo.eliminarSiNombreContiene(nombre);
    }

    @Override
    public List<Curso> listarPorEstado(boolean activo) {
        return cursoRepo.listarPorEstado(activo);
    }

    @Override
    public List<Curso> listarOrdenadoPorCampo() {
        return cursoRepo.listarOrdenadoPorCampo();
    }
}
