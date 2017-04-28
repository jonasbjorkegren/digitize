package se.kb.digitize.business.orders.control;

import se.kb.digitize.business.orders.entity.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by jonbjo on 17-04-28.
 */
public class OrderStore {

    @PersistenceContext(unitName = "dev")
    EntityManager em;

    public List<Order> all() {
        return this.em.createNamedQuery("all", Order.class).getResultList();
    }

    public void save(Order order) {
        em.merge(order);
    }
}
