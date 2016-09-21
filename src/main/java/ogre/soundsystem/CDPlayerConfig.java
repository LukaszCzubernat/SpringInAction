package ogre.soundsystem;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerConfig {
    ApplicationContext context = new ClassPathXmlApplicationContext("mediaPlayer.xml");

}
