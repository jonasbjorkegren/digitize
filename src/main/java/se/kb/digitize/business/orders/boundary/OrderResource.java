package se.kb.digitize.business.orders.boundary;

import se.kb.digitize.business.orders.entity.Order;

import javax.inject.Inject;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by jonbjo on 17-04-28.
 */
@Path("orders")
public class OrderResource {

    @Inject
    OrderService orderService;

    @GET
    public List<Order> orders() {
        return orderService.getAllOrders();
    }

    @POST
    public void save(JsonObject order) {
        String description = order.getString("description");
        orderService.save(new Order(description));
    }
}
