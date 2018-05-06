import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String t, n, z, c, eg;
        char g;
        int hp;
        boolean qm, hq;
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        character[] chars = new character[inp];

        for(int i = 0; i < inp; i++){
            t = sc.next();
            sc.nextLine();
            n = sc.nextLine();
            g = sc.next().charAt(0);
            hp = sc.nextInt();

            switch(t) {
                case "Player":
                    c = sc.next();
                    eg = findGear(c);
                    chars[i] = new player(t, n, g, hp, c, eg);
                    break;
                case "Mob":
                    sc.nextLine();
                    z = sc.nextLine();
                    c = sc.next();
                    qm = sc.nextBoolean();
                    chars[i] = new mob(t, n, g, hp, z, c, qm);
                    break;
                case "Townsperson":
                    sc.nextLine();
                    z = sc.nextLine();
                    hq = sc.nextBoolean();
                    chars[i] = new townsperson(t, n, g, hp, z, hq);
                    break;
            }
        }

        print(chars, inp);
    }

    public static String findGear(String classs){
        switch(classs){
            case "Warrior":
                return "Platemail";
            case "Mage":
                return "Cloth";
            case "Rogue":
                return "Leather";
        }
        return "";
    }

    public static void print(character[] ch, int j){
        System.out.print("Player Characters");
        System.out.format("\n%15s%15s%15s%15s%25s\n", "Name", "Gender", "Hit Points", "Class", "Equippable Gear");
        for(int i = 0; i < j; i++)
            if(ch[i].getType().equals("Player"))
                System.out.println(ch[i].toString());
        System.out.print("\nNPC's - Mobs");
        System.out.format("\n%15s%15s%15s%25s%15s%15s\n", "Name", "Gender", "Hit Points", "Zone", "Class", "Quest Mob");
        for(int i = 0; i < j; i++)
            if(ch[i].getType().equals("Mob"))
                System.out.println(ch[i].toString());
        System.out.print("\nNPC's - Towns People");
        System.out.format("\n%15s%15s%15s%25s%15s\n", "Name", "Gender", "Hit Points", "Zone", "Has Quest?");
        for(int i = 0; i < j; i++)
            if(ch[i].getType().equals("Townsperson"))
                System.out.println(ch[i].toString());
    }
}
