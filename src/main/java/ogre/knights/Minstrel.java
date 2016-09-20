package ogre.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void singBeforeQuest(){
        printStream.println("Hear me, hear me brave knight begins his journey");
    }

    public void singAfterQuest(){
        printStream.println("Hear me, hear me brave knight fulfilled his quest");
    }
}
