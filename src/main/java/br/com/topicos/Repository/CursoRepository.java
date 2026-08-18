package br.com.topicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.topicos.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}