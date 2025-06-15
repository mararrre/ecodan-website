package org.example.siteforbread.controllers;

import org.example.siteforbread.model.Review;
import org.example.siteforbread.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @PostMapping("/review")
    public String handleReview(Review review) {
        reviewRepository.save(review);
        return "redirect:/";
    }

    @GetMapping("/")
    public String showHomePage(Model model) {
        List<Review> reviews = reviewRepository.findAll();
        model.addAttribute("reviews", reviews);
        return "index";
    }
}
