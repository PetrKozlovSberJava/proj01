package org.example.proj01.controller;

import org.example.proj01.models.Post;
import org.example.proj01.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class LmsController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/lms")
    public String lmsMain(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "lms-main";
    }

    @GetMapping("/lms/add")
    public String lmsAdd(Model model) {

        return "lms-add";
    }

    /* add post to table */
    @PostMapping("/lms/add")
    public String lmsPostAdd(@RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post post = new Post(title,anons,full_text);
        postRepository.save(post);
        // return "redirect:/lms";
        return "lms-main";
    }
    /* edit post in table */
    @PostMapping("/lms/{id}/edit")
    public String lmsPostUpdate(@PathVariable(value = "id") long id, @RequestParam String title, @RequestParam String anons, @RequestParam String full_text, Model model) {
        Post post = postRepository.findById(id).orElseThrow();
        post.setTitle(title);
        post.setAnons(anons);
        post.setFull_text(full_text);
        postRepository.save(post);
        return "redirect:/lms";
    }
    /* delete post from table */
    @PostMapping("/lms/{id}/remove")
    public String lmsPostDelete(@PathVariable(value = "id") long id, Model model) {
        Post post = postRepository.findById(id).orElseThrow();
        postRepository.delete(post);
        return "redirect:/lms";
    }


    @GetMapping("/lms/{id}")
    public String lmsDetails(@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)) {
            return "redirect:/lms";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "lms-details";
    }

    @GetMapping("/lms/{id}/edit")
    public String lmsEdit(@PathVariable(value = "id") long id, Model model) {
        if(!postRepository.existsById(id)) {
            return "redirect:/lms";
        }
        Optional<Post> post = postRepository.findById(id);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post", res);
        return "lms-edit";
    }

}
