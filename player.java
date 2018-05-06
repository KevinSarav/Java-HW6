class player extends character{
    private String classType, armorType;

    public player(){
        super();
        classType = null;
        armorType = null;
    }

    public player(String t, String n, char g, int hp, String ct, String at) {
        super(t, n, g, hp);
        classType = ct;
        armorType = at;
    }

    public String toString(){
        return super.toString() + String.format("%15s%25s", classType, armorType);
    }
}

