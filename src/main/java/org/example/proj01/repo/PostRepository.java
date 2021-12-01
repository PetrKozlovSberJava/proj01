package org.example.proj01.repo;

import org.example.proj01.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
