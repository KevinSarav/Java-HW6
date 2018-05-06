class mob extends npc{
    private String classType;
    private boolean questMob;

    public mob(){
        super();
        classType = null;
        questMob = false;
    }

    public mob(String t, String n, char g, int hp, String z, String ct, boolean qm){
        super(t, n, g, hp, z);
        classType = ct;
        questMob = qm;
    }

    public String toString() {
        return super.toString() + String.format("%15s%15s", classType, questMob);
    }
}
