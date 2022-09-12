package hello.proxy.app.v2;

import hello.proxy.app.v1.OrderRepositoryV1;

/**
 * @author bumblebee
 */
public class OrderServiceV2 {

    private OrderRepositoryV2 orderRepository;

    public OrderServiceV2(OrderRepositoryV2 orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
