package ogre.concert;

@ActEvent
@Event
public class Act implements Performance {

    @Action
    @Override public void perform() throws Exception {
        throw new Exception("Main actor is sic!");
    }
}
