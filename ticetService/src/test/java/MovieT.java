
import com.lovo.movie.MovieMain;
import com.lovo.movie.entity.TicketEntity;
import com.lovo.movie.service.ITicketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MovieMain.class)
public class MovieT {

    @Autowired
    ITicketService ticketService;

    @Test
    public void sava(){
        List<TicketEntity> list=new ArrayList<>();
        for(int i=1;i<10;i++){
            TicketEntity entity=new TicketEntity();
            entity.setIndex(i);
            entity.setMovieName("复仇者联盟"+i);
            entity.setTicketNum(10*i);
            entity.setTicketPrice(1000-(10*i));
            entity.setTag(0);
            list.add(entity);
        }

        ticketService.sava(list);

    }

    @Test
    public void findAllTicket(){
     List<TicketEntity> ticketEntityList =   ticketService.findAllTicket();
        for (TicketEntity t: ticketEntityList
             ) {
            System.out.println(t.getIndex()+"/"
            +t.getTag()+"/"
            +t.getTicketNum()+"/"
            +t.getTicketPrice()+"/"
            +t.getMovieName()+"/"
            +t.getIndex()+"/"
            +t.getTicketId());

        }
    }


    @Test
    public void  getTicketByIndex(){
        TicketEntity t = ticketService.getTicketByIndex(9);
        System.out.println(t.getIndex()+"/"
                +t.getTag()+"/"
                +t.getTicketNum()+"/"
                +t.getTicketPrice()+"/"
                +t.getMovieName()+"/"
                +t.getIndex()+"/"
                +t.getTicketId());
    }

    @Test
    public void updateTicketNum(){
        ticketService.updateTicketNum(8);
    }
}
