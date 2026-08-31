package br.com.topicos.service;

import java.util.List;

import br.com.topicos.entity.Disciplina;

public interface DisciplinaService {

    public Disciplina cadastrar(Disciplina disciplina);

    public List<Disciplina> listar();

    public Disciplina buscarPorId(Long id);

    public void matricularAluno(Long disciplinaId, Long alunoId);

}