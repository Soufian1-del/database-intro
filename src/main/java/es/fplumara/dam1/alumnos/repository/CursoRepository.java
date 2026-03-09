package es.fplumara.dam1.alumnos.repository;

import es.fplumara.dam1.alumnos.model.Curso;

import java.util.List;

public interface CursoRepository {

    void initSchema();


    void crearCurso(int id, String nombre, Boolean activo);

    void activar(int id);

    void eliminarSiNombreContiene(String nombre);

    List<Curso> listarPorEstado(boolean activo);

    List<Curso> listarOrdenadoPorCampo(String campo, String tipoDeOrden);
}
