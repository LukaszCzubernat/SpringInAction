package ogre.spittr.data;

import ogre.spittr.Spitter;
import ogre.spittr.Spittle;

import java.util.List;

public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);

    Spitter save(Spitter spitter);

    Spitter findByUserName(String userName);
}
