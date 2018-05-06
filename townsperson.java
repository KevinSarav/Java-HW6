class townsperson extends npc{
    private boolean hasQuest;

    public townsperson(){
        super();
        hasQuest = false;
    }

    public townsperson(String t, String n, char g, int hp, String z, boolean hq){
        super(t, n, g, hp, z);
        hasQuest = hq;
    }

    public String toString(){
        return super.toString() + String.format("%15s", hasQuest);
    }
}
