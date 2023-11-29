package exo3;

import java.sql.Date;

public class voiture extends Vehicule  {

    private int  NbrPortes;
   private int  Puissances ;
    private int  Kilométrage;
    public voiture(String marque, int datedach, int prixdacht, int nbrPortes, int puissances, int kilométrage) {
        super(marque, datedach, prixdacht);
        NbrPortes = nbrPortes;
        Puissances = puissances;
        Kilométrage = kilométrage;
    }
    public int getNbrPortes() {
        return NbrPortes;
    }
    public int getPuissances() {
        return Puissances;
    }
    public int getKilométrage() {
        return Kilométrage;
    }
    public void setNbrPortes(int nbrPortes) {
        NbrPortes = nbrPortes;
    }
    public void setPuissances(int puissances) {
        Puissances = puissances;
    }
    public void setKilométrage(int kilométrage) {
        Kilométrage = kilométrage;
    }
   @Override
   public double calculprix(){
    int co=0;
    for(int i=100000;i <Kilométrage;i=i+100000){
        
        co=co+1;
    }
    return super.calculprix()-0.10*co*100000;

   }
   @Override
   public void afficher(){
    super.afficher();
    System.out.println(calculprix()+"le nombre de porte "+getNbrPortes()+"sa puissance est "+getPuissances()+"elle a marcher "+getKilométrage()+" mille kilometere,est les infos de vehicule est ");
   }


  
    
}
