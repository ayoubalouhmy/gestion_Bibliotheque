public class Emprunt {
    private int id;
    private Livre livre;
    private Member member;
    private String DateEmprunt; 
    private String DateRetour; 
    private String Status;
    Emprunt(int id , Livre livre, Member member , String DateEmprunt , String DateRetour ){
        this.id = id;
        this.livre = livre;
        this.member = member;
        this.DateEmprunt = DateEmprunt;
        this.DateRetour = DateRetour;
        this.Status = "en cours";
        this.livre.setdisponibiliter(false);
    };   
    // getters
    int getId(){return id;};
    Livre getLivre(){return livre;};
    Member getMember(){return member;};
    String getDateEmprunt(){return DateEmprunt;};
    String getDateRetour(){return DateRetour;};
    String getStatus(){return Status;};
    // setters
    String setStatus(String Status){return this.Status = Status;};
    void AfficherInfos(){
        System.out.println("livre : " + livre.gettitle() +"\nmember : " + member.getPrenom() + member.getNom()
        + "\nDateEmprunt : " + DateEmprunt + "\nDateRetour : " + DateRetour + "\nStatus : " + Status);
    };
    void RetournerLivre(String DateRetour){
        this.Status = "Retourner";
        this.DateRetour = DateRetour;
        this.livre.setdisponibiliter(true);
    }
}
