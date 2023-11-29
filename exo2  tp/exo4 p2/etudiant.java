
import java.util.Scanner;
public class etudiant extends Personne {
    
    static final int n=5;
    int tab[];
    public etudiant(String nom, String prenom, int age) {
        super(nom, prenom, age);
        tab=new int[n];
    }
    public void rempliretab(){
        Scanner scan=new Scanner(System.in);
       
        for(int i=0;i<n;i++){

             int note=scan.nextInt();
       
            tab[i]=note;
        
    }}
    public float calcmoyen(){
     int resultmoy=0;
     for(int j=0;j<n;j++){
        resultmoy=tab[j]+resultmoy;
     }
     return resultmoy/5;

    }
    @Override
    public String toString(){
        super.toString();
        return "la moyenne de etudiant est :"+calcmoyen();
    }
}
