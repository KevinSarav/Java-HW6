class character {
    protected String Type, name;
    protected char gender;
    protected int hitPoints;

    public character(){
        Type = null;
        name = null;
        gender = '\0';
        hitPoints = 0;
    }

    public character(String t, String n, char g, int hp){
        Type = t;
        name = n;
        gender = g;
        hitPoints = hp;
    }

    public String toString(){
            return String.format("%15s%15s%15s", name, gender, hitPoints);
        }

    public String getType() {
        return Type;
    }
}
