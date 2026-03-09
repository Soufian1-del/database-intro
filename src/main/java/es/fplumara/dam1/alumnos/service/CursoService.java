package es.fplumara.dam1.alumnos.service;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public interface CursoService {
    void initSchema();

    void activar(int id);

    void eliminarSiNombreContiene(String nombre);

    List<Curso> listarPorEstado(boolean activo);

    List<Curso> listarOrdenadoPorCampo(String campo, String tipoDeOrden);
}
