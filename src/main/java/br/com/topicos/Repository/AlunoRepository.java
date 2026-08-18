package br.com.topicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.topicos.entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}