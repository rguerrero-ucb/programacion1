package estructuras.repetitivas;

public class Repetitiva {
    public static void main(String args[]){
        int i = 0;
        int acum = 0;
        while (i < 10){
            i = i + 1;
            System.out.print(i);
            acum = acum + i;
            System.out.print(" ");
        }
        System.out.println(" = " + acum);

        int j = 1;
        acum = 0;
        while ( j <= 10) {
            System.out.print(j);
            acum = acum + j;
            System.out.print(" ");
            j = j + 2;
        }
        System.out.println(" = " + acum);

        acum = 0;
        for(int c = 1; c <= 10; c = c + 3){
            System.out.print(c);
            acum = acum + c;
            System.out.print(" ");
        }
        System.out.println(" = " + acum);
    }
}
