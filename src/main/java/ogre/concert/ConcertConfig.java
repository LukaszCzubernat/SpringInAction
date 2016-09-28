package ogre.concert;

import org.springframework.context.annotation.*;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(includeFilters = @ComponentScan.Filter(
        value= Event.class,
        type = FilterType.ANNOTATION))
public class ConcertConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

}
