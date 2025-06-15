package org.example.siteforbread.repository;

import org.example.siteforbread.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
