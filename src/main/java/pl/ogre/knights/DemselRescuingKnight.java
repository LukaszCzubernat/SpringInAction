package pl.ogre.knights;

public class DemselRescuingKnight implements Knight{

    private Quest quest;

    public DemselRescuingKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
