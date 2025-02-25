package com.arfilho.workshopmongo.services;

import com.arfilho.workshopmongo.domain.Post;
import com.arfilho.workshopmongo.exception.ObjectNotFoundException;
import com.arfilho.workshopmongo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
