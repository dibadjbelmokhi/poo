

import java.util.Scanner;

public class collectenmb { 
    private int  number;
     public collectenmb(int number){
       this.number=number;
     }
    public static void verifnmb(int number){
        if( number % 2== 0 ){
            System.out.println("le nombre "+number+"est pair");}
            else{
             System.out.println("le nombre "+number+"est impaire");
            }
        }
    
    
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("entrer nombre entier ");
          int a= scanner.nextInt();
          int b=scanner.nextInt();
          int c=scanner.nextInt();
          int d=scanner.nextInt();
        collectenmb n= new collectenmb(a);
        collectenmb n1=new collectenmb(b);
        collectenmb n2=new collectenmb(c);
        collectenmb n3=new collectenmb(d);
       collectenmb.verifnmb(n.number);
       collectenmb.verifnmb(n1.number);
       collectenmb.verifnmb(n2.number);
       collectenmb.verifnmb(n3.number);
        scanner.close();
    }
}
