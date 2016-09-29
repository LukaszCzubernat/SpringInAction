package ogre.concert;

@Event
@Encore
public class DefaultEncorable implements Encoreable {

    @Action
    @Override public void performanceEncore() {
        System.out.println("Encore in progress");
    }
}
