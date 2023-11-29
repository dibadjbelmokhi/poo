package exo3;

import java.util.Scanner;

public class Maiin {
    public static void main(String []args ){
    
    avion avio=new avion("tasili", 2022, 1800000, 80000);
    avion avio2=new avion("algerietel", 2010, 50000000, 90000);
   voiture vv=new voiture("porshe", 2005, 100, 4, 500, 2000000);
voiture v1=new voiture("prshe", 2005, 100, 4, 500, 2000000);
v1.afficher();
vv.afficher();
avio.afficher();
avio2.afficher();
System.out.println("la valeur est :  "+vv.equals(avio));
    }
    
}
