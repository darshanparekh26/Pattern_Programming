package Pattern;

      /*11111
        22222
        33333
        44444
        55555*/
public class Rectangle1 {
    public void print() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
