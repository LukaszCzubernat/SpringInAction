package ogre.email;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = EmailConfig.class)
public class EmailTest {

    @Autowired
    Email email;

    @Autowired
    ApplicationContext context;

    @Test
    public void testEmail(){
        // given
        System.out.println(email.showEmailAddress());
    }
}
