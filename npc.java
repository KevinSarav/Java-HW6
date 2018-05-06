class npc extends character{
    protected String zone;

    public npc(){
        super();
        zone = null;
    }

    public npc(String t, String n, char g, int hp, String z){
        super(t, n, g, hp);
        zone = z;
    }

    public String toString() {
        return super.toString() + String.format("%25s", zone);
    }
}
