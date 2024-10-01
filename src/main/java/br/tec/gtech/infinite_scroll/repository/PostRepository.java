package br.tec.gtech.infinite_scroll.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import br.tec.gtech.infinite_scroll.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findFirst10ByIdGreaterThanOrderByIdAsc(Long id);

    // Método para buscar a primeira página (quando não há cursor)
    List<Post> findFirst10ByOrderByIdAsc();
}