package ogre.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("knights");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
