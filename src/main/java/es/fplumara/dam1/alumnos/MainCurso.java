package es.fplumara.dam1.alumnos;

import es.fplumara.dam1.alumnos.repository.CursoRepository;
import es.fplumara.dam1.alumnos.repository.CursoRepositoryDB;

public class MainCurso {
    public static void main(String[] args) {
        String url  = "jdbc:postgresql://localhost:5432/dam1";
        String user = "dam1";
        String pass = "dam1pass";

        CursoRepository cursoRepo = new CursoRepositoryDB(url, user, pass);

        cursoRepo.initSchema();

        cursoRepo.crearCurso(44, "lenguaje de marcas", true);
        cursoRepo.crearCurso(21342, "programacion", false);
        cursoRepo.crearCurso(34324, "lenguaje de marcas", true);
        cursoRepo.crearCurso(55431, "AWS", true);
        cursoRepo.crearCurso(16774, "aplicaciones web", false);
        cursoRepo.crearCurso(11236, "bases de datos", true);
        cursoRepo.crearCurso(14668, "sistemas informaticos", false);
        cursoRepo.crearCurso(19123, "IPE", true);
        cursoRepo.crearCurso(10432, "lenguaje de marcas", false);
        cursoRepo.crearCurso(18432, "lenguaje de marcas", false);
        cursoRepo.crearCurso(14435, "lenguaje de marcas", false);
        cursoRepo.crearCurso(14323, "lenguaje de marcas", true);


        cursoRepo.listarOrdenadoPorCampo();
        cursoRepo.listarPorEstado(true);
        cursoRepo.eliminarSiNombreContiene("marc");
        cursoRepo.activar(18432);
}
}
