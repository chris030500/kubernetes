package com.csalazar.springcloud.msvc.cursos.services;

import com.csalazar.springcloud.msvc.cursos.models.entity.Curso;

import java.util.List;
import java.util.Optional;

public interface CursoService {
    List<Curso> listar();
    Optional<Curso> porId(Long id);
    Curso guardar(Curso corso);
    void eliminar(Long id);
}
