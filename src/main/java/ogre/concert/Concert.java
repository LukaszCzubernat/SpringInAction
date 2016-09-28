package ogre.concert;

@MusicEvent
@Event
public class Concert implements Performance {

    @Action
    @Override public void perform() throws Exception {
        System.out.println("Concert in progress");
    }
}
