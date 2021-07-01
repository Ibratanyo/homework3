public class homework3 {
    public static void main(String[] args) {

        String[] names = {"Ruslan", "Ibragim", "Danchik"};
        String[] names2 = {names[0], names[1], names[2], "Alex"};
        System.out.println("Helllo, guys!");

        for (int i = 0; i < names2.length; i++) {
            int name = i;
            switch (name) {
                case 0:
                    System.out.println("Good morning! " + names2[i]);
                    break;

                case 1:
                    System.out.println("Good day! " + names2[i]);
                    break;

                case 2:
                    System.out.println("Good evening! " + names2[i]);
                    break;
                case 3:
                    System.out.println("Good by! " + names2[i]);
                    break;
            }
        }
    }
}
