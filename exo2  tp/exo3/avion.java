package exo3;

import java.sql.Date;

public class avion extends Vehicule {
    private int heuresdevol;

    public avion(String marque, int datedach, int prixdacht, int heuresdevol) {
        super(marque, datedach, prixdacht);
        this.heuresdevol = heuresdevol;
    }

    public int getHeuresdevol() {
        return heuresdevol;
    }

    public void setHeuresdevol(int heuresdevol) {
        this.heuresdevol = heuresdevol;
    }
    @Override
    public double calculprix(){
        int co=0;
        for(int i=5000;i <= heuresdevol;i=i+5000){
            
            co=co+1;
        }
        return super.calculprix()-0.08*co*heuresdevol;
    }
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("les heure de vol est "+getHeuresdevol());
    }
    

    
}
