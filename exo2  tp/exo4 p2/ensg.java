import java.util.Scanner;

public class ensg extends Personne {
    String [] module;
    static final int j=4;
    int i;
    public ensg(String nom, String prenom, int age) {
        super(nom, prenom, age);
        module=new String[j];
    }
    public void affectmodule(){
         Scanner scann=new Scanner(System.in);
        for( i=0;i<j;i++){
            String mo=scann.nextLine();
            module[i]=mo;
        }
    }

    }

