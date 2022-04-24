package com.educandoweb.workshop.repositories;

import com.educandoweb.workshop.entities.OrderItem;
import com.educandoweb.workshop.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}