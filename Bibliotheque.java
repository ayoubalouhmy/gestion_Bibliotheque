
import java.util.ArrayList;
public class Bibliotheque {
    private String nom;
    private String addresse;
    private ArrayList<Livre> livres; 
    private ArrayList<Member> members; 
    private ArrayList<Emprunt> emprunts; 
    Bibliotheque(String nom ,String addresse  ){
        this.nom = nom;
        this.addresse = addresse;
        livres = new ArrayList<>();
        members = new ArrayList<>();
        emprunts = new ArrayList<>();
    }
    // getters
    String getNom(){return nom;};
    String getAddresse(){return addresse;};
    void AjouterLivre(Livre livre){livres.add(livre);};
    void AjouterMember(Member member){members.add(member);};
    void AjouterEmprunt(Emprunt emprunt){emprunts.add(emprunt);};
    void AfficherLivres(){System.out.println("===== Livres ===== ");
        for(Livre livre : livres){
            livre.AfficherInfos();
        };
    };
    void AfficherMembers(){
        System.out.println("===== Members =====");
        for(Member member : members){
            member.AfficherInfos();
        }
    }
    void AfficherEmprunts(){
        System.out.println("===== Emprunts =====");
        for (Emprunt emprunt : emprunts){
            emprunt.AfficherInfos();
        }
    }

    
}
