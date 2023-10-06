public class Demo {
    public static void main(String[] args) {

        Music m1 = new Music(new Date(3, 4, 2023), "cruel Summer", new Artist("taylor", "american", 5), 3, "pop", "lover");
        Music m2 = new Music(new Date(5, 6, 2022), "cold as you", new Artist("taylor", "American", 3), 4, "jazz", "folklore");
        Music m3 = new Music(new Date(3, 6, 2021), "emotions", new Artist("deep focus", "canadian", 4), 4, "pop", "box of puzzles");
        Music m4 = new Music(new Date(7, 9, 2020), "evening stars", new Artist("ariana", "canadian", 2), 3, "jazz", "lover");
        Music m5 = new Music(new Date(3, 10, 2023), "love like this", new Artist("zayn", "canadian", 4), 3, "jazz", "love like this");

        Music list[] = new Music[20];
        list[0]=m1;
        list[1]=m2;
        list[2]=m3;
        list[3]=m4;
        list[4]=m5;

        //System.out.println(m1);
        //System.out.println(m2);
        //System.out.println(m3);
        //System.out.println(m4);
        //System.out.println(m5);

        for (int i = 0; i<5;i++)
        {
            System.out.println(list[i]);
        }
        for (int i = 0; i<5;i++)
        {
            if (list[i].equals(list[i+1])) {
                System.out.println("Equal");
            } else {
                System.out.println("not equal");
            }
        }
    }
}
