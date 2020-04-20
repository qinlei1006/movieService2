
import com.lovo.userservice.UserMain;
import com.lovo.userservice.entity.UserEntity;
import com.lovo.userservice.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserMain.class)
public class TestMain {
    @Autowired
    IUserService userService;
    @Test
    public void sava(){
        UserEntity u=new UserEntity();
        u.setUserName("鲁班");
        u.setPassword("321");
        userService.saveUser(u);
    }


}
