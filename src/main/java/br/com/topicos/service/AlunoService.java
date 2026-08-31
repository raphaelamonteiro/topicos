package br.com.topicos.service;

import java.util.List;

import br.com.topicos.entity.Aluno;

public interface AlunoService {

    public Aluno cadastrar(Aluno aluno);

    public List<Aluno> listar();

    public Aluno buscarPorId(Long id);

}