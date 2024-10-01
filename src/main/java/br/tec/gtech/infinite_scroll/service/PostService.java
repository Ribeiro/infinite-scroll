package br.tec.gtech.infinite_scroll.service;

import java.util.List;
import org.springframework.stereotype.Service;
import br.tec.gtech.infinite_scroll.entity.Post;
import br.tec.gtech.infinite_scroll.repository.PostRepository;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;

    public List<Post> getPostsAfter(Long lastPostId) {
        if (lastPostId == null) {
            // Retorna a primeira página se não houver `lastPostId`
            return postRepository.findFirst10ByOrderByIdAsc();
        } 

        // Retorna a próxima página baseada no último `id` da página anterior
         return postRepository.findFirst10ByIdGreaterThanOrderByIdAsc(lastPostId);
    }
}

