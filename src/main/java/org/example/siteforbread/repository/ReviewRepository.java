package org.example.siteforbread.repository;

import org.example.siteforbread.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}