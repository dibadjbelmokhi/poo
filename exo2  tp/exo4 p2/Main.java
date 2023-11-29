public class Main {
    public static void main(String[] args) {
       
    etudiant etud=new etudiant("abdou", "bra", 20);
    ensg ensi=new ensg("farah", "kawawa", 35);
    etud.rempliretab();
    System.out.println("info de etud est"+etud);
    System.out.println("-----------------");
    ensi.affectmodule();
    System.out.println("les info densi"+ensi);
     System.out.println("-----------------");
    }
    
}
