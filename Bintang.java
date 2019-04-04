package SJN;

public class Bintang {

    public static void main(String[] args) {
//        huruf A
        for (int i = 0; i <= 7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (i == 1 && j == 4 || (i==3 && (j==3 || j==5)) || i==5 && (j>1 && j<7) ||
                        i==7 && j==1 || i==7 && j==7 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}
