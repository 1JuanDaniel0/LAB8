package com.example.lab8.controller;

import com.example.lab8.repository.BlogsRepository;
import com.example.lab8.entity.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/")
public class PrincipalController {
    @Autowired
    private BlogsRepository blogsRepository;

    @GetMapping("/posts")
    public String mostrarPosts(Model model){
        List<BlogPost> blogPosts = blogsRepository.findAll();
        model.addAttribute("posts",blogPosts);
        return "principal";
    }

    @GetMapping("/detalles")
    public String detalles(Model model, @RequestParam Long id){
        model.addAttribute("post",blogsRepository.findBlogPostsById(id));
        return "detalles";
    }
}
