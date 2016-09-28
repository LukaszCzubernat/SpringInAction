package ogre.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Email {
    String address;

    @Autowired
    ApplicationContext context;

    public Email(@Value("#{systemProperties['email']}") String address) {
        validate(address);
    }

    @PostConstruct
    public void foo() {
        System.out.println(address);
    }

    private void validate(@Value("#{matches '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.pl}'") String address) {
        this.address = address;
    }

    public String showEmailAddress() {
        return address;
    }
}
