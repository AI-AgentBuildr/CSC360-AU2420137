public class DrawSquare {
    public static void main(String[] args) {
        int size = 5;
        System.out.println("Printing a " + size + "x" + size + " Square:\n");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
