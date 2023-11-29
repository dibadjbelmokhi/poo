package exo3;

import java.sql.Date;

public class Vehicule {
    private String marque;
    private int datedach;
    private int prixdacht;

    public Vehicule(String marque, int datedach, int prixdacht) {
        this.marque = marque;
        this.datedach = datedach;
        this.prixdacht = prixdacht;
    }
    
    public void afficher(){
    System.out.println("la marque de vehicule est"+marque+"la date dacheter est: "+datedach+" "+"le prix dachter est : "+prixdacht);
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDatedach(int datedach) {
        this.datedach = datedach;
    }

    public void setPrixdacht(int prixdacht) {
        this.prixdacht = prixdacht;
    }

    public String getMarque() {
        return marque;
    }

    public int getDatedach() {
        return datedach;
    }

    public int getPrixdacht() {
        return prixdacht;
    }
    public double  calculprix(){
        return   prixdacht-0.05*prixdacht*(2023-datedach);
       }
 @Override

 public boolean equals (Object o){
    if(this==o){
        return true;
    }
    else{
        return false;
    }
 }


}
