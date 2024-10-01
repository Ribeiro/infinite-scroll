package br.tec.gtech.infinite_scroll.controller;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import br.tec.gtech.infinite_scroll.entity.Post;
import br.tec.gtech.infinite_scroll.service.PostService;
import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getPosts(@RequestParam(required = false) Long lastPostId) {
        List<Post> posts = postService.getPostsAfter(lastPostId);
        return ResponseEntity.ok(posts);
    }
}