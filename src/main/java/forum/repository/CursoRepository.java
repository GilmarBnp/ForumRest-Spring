package forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);
		
}
