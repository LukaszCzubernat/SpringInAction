package ogre.spittr.data;

import ogre.spittr.Spitter;
import ogre.spittr.Spittle;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SpittleRepositoryImpl implements SpittleRepository {
    private Map<Long, Spitter> spitters = new HashMap();

    @Override public List<Spittle> findSpittles(long max, int count) {
        return Arrays.asList(new Spittle("Wololo", new Date()), new Spittle("Wololo2", new Date()));
    }

    @Override public Spittle findOne(long spittleId) {
        return new Spittle("Hellooo hooman", new Date());
    }

    @Override public Spitter save(Spitter spitter) {
        spitters.put(spitter.getSpitterId(), spitter);
        return spitters.get(spitter.getSpitterId());
    }

    @Override public Spitter findByUserName(String userName) {
        return spitters.values().stream().filter(spitter -> spitter.getUserName().equals(userName)).findFirst().get();
    }
}
