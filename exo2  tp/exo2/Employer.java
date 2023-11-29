class Employer {
    private String nom;
    private String prenom;
    private int anneederecu;
    private int nombreheure;
    private int NbrHeuresSupp;

    public Employer(String nom, String prenom, int anneederecu, int nombreheure, int NbrHeuresSupp) {
        this.nom = nom;
        this.prenom = prenom;
        this.anneederecu = anneederecu;
        this.nombreheure = nombreheure;
        this.NbrHeuresSupp = NbrHeuresSupp;
    }

    public  String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneederecu() {
        return anneederecu;
    }

    public int getNombreheure() {
        return nombreheure;
    }

    public int getNbrHeuresSupp() {
        return NbrHeuresSupp;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneederecu(int anneederecu) {
        this.anneederecu = anneederecu;
    }

    public void setNombreheure(int nombreheure) {
        this.nombreheure = nombreheure;
    }

    public void setNbrHeuresSupp(int nbrHeuresSupp) {
        NbrHeuresSupp = nbrHeuresSupp;
    }
    @Override
    public String toString(){
   return ("le nom dun employer est "+nom+"le prenom dun employer est"+prenom+"lannée de recrutement est "+anneederecu+"le nombre dheure de cet employer est "+nombreheure+"est le nombredheure supp est :"+NbrHeuresSupp);

    }
}
