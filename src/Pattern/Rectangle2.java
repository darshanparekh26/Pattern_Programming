package Pattern;

/*
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
1 2 3 4 5
*/
public class Rectangle2 {
    public void print() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
