

public class Main {
    public static void main(String[] args ){
        Livre livre1 = new Livre(1, "Le Petit Prince", "Antoine de Saint-Exupéry", 1943);
        Livre livre2 = new Livre(2, "L'etrager", "Albert Camus", 1942);
        Member member1 = new Member(1, "ayoub", "alouhmy", "ayoubalouhmy02@gmail.com");
        Member member2 = new Member(2, "sara", "benali", "sara@gmail.com");
        Bibliotheque bibliotheque = new Bibliotheque( "Bibliothèque Centrale","Casablanca");
        Emprunt emprunt1 = new Emprunt(1, livre1, member1, "18/08/2026", "20/08/2026");
        Emprunt emprunt2 = new Emprunt(2, livre2, member2, "20/08/2026", null);
        bibliotheque.AjouterLivre(livre1);

        bibliotheque.AjouterLivre(livre2);

        bibliotheque.AjouterMember(member1);

        bibliotheque.AjouterMember(member2);

        bibliotheque.AjouterEmprunt(emprunt1);

        bibliotheque.AjouterEmprunt(emprunt2);

        livre2.setdisponibiliter(false);
        emprunt1.setStatus("Retourner");
        livre1.setdisponibiliter(true);

        bibliotheque.AfficherLivres();
        System.out.println();
        bibliotheque.AfficherMembers();
        System.out.println();
        bibliotheque.AfficherEmprunts();
    };
}
