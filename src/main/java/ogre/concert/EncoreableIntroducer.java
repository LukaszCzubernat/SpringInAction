package ogre.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value = "Performance+", defaultImpl = DefaultEncorable.class)
    public static Encoreable encoreable;
}
