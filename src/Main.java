public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("gib eine Note aus:");
        String eins="Sehr Gut";
        String zwei="Gut";
        String drei="Befriedigend";
        String vier="Genügend";
        String fünf="Nicht Genügend";
        int note=sc.nextInt();

        int einz,zwe,dre,vie,funf;
        einz=1;
        zwe=2;
        dre=3;
        vie=4;
        funf=5;
        if(note==einz) {System.out.println(eins);}
        else if (note==zwe){System.out.println(zwei);}
        else if (note==dre){System.out.println(drei);}
        else if (note==vie){System.out.println(vier);}
        else if (note==funf){System.out.println(fünf);}
        else {System.out.println("Falsche eingabe");}

    }
