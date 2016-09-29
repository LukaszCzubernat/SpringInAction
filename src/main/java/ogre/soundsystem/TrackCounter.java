package ogre.soundsystem;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Aspect
public class TrackCounter {

    private Map<Integer, Integer> trackCounts = new HashMap<>();

    @Pointcut("execution(* CompactDisc.playTrack(int)) && args(trackNumber)")
    public void trackPlayed(int trackNumber) {}

    @Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        trackCounts.put(trackNumber, Optional.ofNullable(trackCounts.get(trackNumber)).orElse(0) +1);
    }

    public int getTracksPlayed(int trackNumber){
        return trackCounts.containsKey(trackNumber) ? trackCounts.get(trackNumber): 0;
    }
}
