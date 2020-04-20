import com.lovo.movie.MovieMain;
import com.lovo.movie.entity.OrderEntity;
import com.lovo.movie.service.IOrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieMain.class)
public class orderT {

    @Autowired
    IOrderService orderService;

    @Test
    public void saveOrder(){
        for (int i = 1;i < 10 ; i++) {
        OrderEntity orderEntity = new OrderEntity();
            orderEntity.setIndex(i);
            orderEntity.setMovieName("复联"+1);
            orderEntity.setOrderNum(""+i);
            orderEntity.setTag(0);
            orderEntity.setUserName("用户"+i);
            orderEntity.setTicketPrice(88.62f * i );
            orderEntity.setTicketNum(i);
            orderService.savaOrder(orderEntity);
        }
    }

    @Test
    public void findAll(){
        List<OrderEntity> orderEntities = orderService.findAllOrder();
        for (OrderEntity o:orderEntities
             ) {
            System.out.println(o.getOrderId()+"/"
            +o.getOrderNum()+"/"
            +o.getMovieName()+"/"
            +o.getOrderNum()+"/"
            +o.getUserName()+"/"
            +o.getIndex()+"/"
            +o.getTag()+"/"
            +o.getTicketPrice());
        }
    }
}
