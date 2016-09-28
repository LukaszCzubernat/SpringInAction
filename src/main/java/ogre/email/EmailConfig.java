package ogre.email;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class EmailConfig {

    @Bean
    public static PropertyPlaceholderConfigurer getPropertyPlaceholderConfigurer(){
        return new PropertyPlaceholderConfigurer();
    }

}
