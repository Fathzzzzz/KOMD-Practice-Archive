package com.mycompany.asdpertemuan1;
import java.util.Scanner;
public class Asdpertemuan1{
    static String nama = "elmatador";
    static int umur = 30;
    public static void main(String[] args){
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Siapakah namamu? ");
        nama = scan1.nextLine();
        System.out.print("Berapakah umur mu? ");
        umur = scan1.nextInt();
        System.out.print("Halo "+nama+"Umur mu: "+umur+" tahun");
    }
}
/* halo
test comment
*/
//halo