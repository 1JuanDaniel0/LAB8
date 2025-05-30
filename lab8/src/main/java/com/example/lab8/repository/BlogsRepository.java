package com.example.lab8.repository;
import com.example.lab8.entity.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

public interface BlogsRepository extends JpaRepository<BlogPost, Long> {
    List<BlogPost> findBlogPostsById(Long id);
}
