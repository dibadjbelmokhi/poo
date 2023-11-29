import java.util.ArrayList;
import java.util.Arrays;

public class document {
    private String nom;
    ArrayList<Personne> authors;

    public document(String nom,  ArrayList<Personne> authors ) {
        this.nom = nom;
        this.authors = authors;
        
    }

    public int NbrAuteur() {
      
        return  authors.size();
    }

    public String toString() {
        StringBuilder authorname = new StringBuilder();
        for (int i = 0; i < authors.size(); i++) {
            authorname.append(authors.get(i).getNom()).append(" ").append(authors.get(i).getPrenom()).append(",");
        }
        return "documennt name:" + nom + "authors:" + authorname.toString();
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Personne> getAuthors() {
        return authors;
    }
    
}
