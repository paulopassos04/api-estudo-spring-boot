package br.com.api.repositories;

import br.com.api.models.OrderItem;
import br.com.api.models.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
    
}
