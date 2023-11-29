 class devloper extends Employer {
    public devloper(String name, String prenom, int anneederecu, int nbrHeures, int nbrHeuresSupp) {
        super(name, prenom, anneederecu, nbrHeures, nbrHeuresSupp);
    }
    public int Callculepaie(){
        return super.getNombreheure()*500;
    }
    public int Callculeheuresupp(){
        return super.getNbrHeuresSupp()*700;
    }
    public int Callcullepaiefinal(){
        return Callculepaie()+Callculeheuresupp()+2000*(2023-getAnneederecu());
    }
    @Override
    public String toString(){
        return "les infos de  devlopeur est :  "+super.toString()+"est le paie final est:   "+Callcullepaiefinal()+"le paie est:  "+Callculepaie()+"le paie des heure est:  "+Callculeheuresupp();
    }

}
