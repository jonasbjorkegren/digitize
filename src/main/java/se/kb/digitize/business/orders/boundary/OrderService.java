package se.kb.digitize.business.orders.boundary;

import se.kb.digitize.business.orders.control.OrderStore;
import se.kb.digitize.business.orders.entity.Order;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by jonbjo on 17-04-28.
 */
@Stateless
public class OrderService {

    @Inject
    OrderStore orderStore;

    public List<Order> getAllOrders() {
        return this.orderStore.all();
    }

    public void save(Order order) {
        this.orderStore.save(order);
    }
}
