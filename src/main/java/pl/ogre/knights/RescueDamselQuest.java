package pl.ogre.knights;

import java.io.PrintStream;

public class RescueDamselQuest implements Quest {

    PrintStream printStream;

    public RescueDamselQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to rescue a damsel");
    }
}
