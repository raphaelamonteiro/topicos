package br.com.topicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.topicos.entity.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    
}