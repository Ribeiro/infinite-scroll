let lastPostId = null;

function loadMorePosts() {
    let url = '/posts';
    if (lastPostId !== null) {
        url += `?lastPostId=${lastPostId}`;
    }

    fetch(url)
        .then(response => response.json())
        .then(posts => {
            // Exibe os posts no frontend
            displayPosts(posts);

            // Atualiza o lastPostId com o id do último post da lista
            if (posts.length > 0) {
                lastPostId = posts[posts.length - 1].id;
            }
        });
}

function displayPosts(posts) {
    // Função para renderizar os posts no frontend
    posts.forEach(post => {
        console.log(`ID: ${post.id}, Title: ${post.title}`);
    });
}
