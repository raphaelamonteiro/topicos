package br.com.topicos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.topicos.Entity.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}