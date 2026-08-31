package br.com.topicos.service;

import java.util.List;
import br.com.topicos.entity.Curso;

public interface CursoService {

    public Curso cadastrar(Curso curso);

    public List<Curso> listar();

    public Curso buscarPorId(Long id);

}