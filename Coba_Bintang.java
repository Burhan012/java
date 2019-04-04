package SJN;
import java.io.*;
public class Coba_Bintang {

    public static void main(String[] args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
//        for (int a = 1; a <= 5; a++) {
//            if (a == 1) {
//                for (int b = 1; b <= 5; b++) {
//                    if (b == 1) {
//                        System.out.print("A");
//                    }else if (b>1 && b<=4){
//                        System.out.print("x");
//                    }else{
//                        System.out.println("Z");
//                    }
//                }
//            }else if (a>1 && a<=4){
//                for()
//                System.out.println("");
//            }
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if ((i == 1 && j == 1) || (i == 5 && j == 5)) {
//                    System.out.print("A");
//                }else if((i == 1 && j ==5) || (i == 5 && j == 1)){
//                    System.out.print("Z");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if ((i ==1 || i == 3 || i == 5) || (j == 1 || j == 5)) {
//                    System.out.print("+");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
//        for (int a = 1; a <= 5; a++) {
//            for (int b = 1; b <= 5; b++) {
//                if (a == 1 || a == 5 || a == 3 || (a == 2 && b == 1) || (a == 2 && b == 5) || (a == 4 && b == 1) || (a == 4 && b == 5)) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println("");
//        }
        try {
            System.out.println("Masukan angka:  ");
            int a =Integer.parseInt(br.readLine());
            int b =a/2+1;
                for (int i = 1; i <= a; i++) {
                    for (int j = 1; j <= a; j++) {
                        if (i==1) {
                            System.out.print("*");
                        }else if(i==a){
                            System.out.print("*");
                        }else if(j>1 && j<a){
                            if (j==b) {
                                System.out.print("*");
                            }else if(i==b){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }else{
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                
            
        } catch (Exception e) {
        }

    }
}
