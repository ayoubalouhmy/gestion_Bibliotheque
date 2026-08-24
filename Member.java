public class Member {
    private int id;
    private String nom;
    private String prenom;
    private String email;

    public Member(int id , String nom , String prenom , String email){
        this.id = id;
        this.nom= nom;  
        this.prenom= prenom;
        this.email= email;

    };
    // getters
    int getId(){return id;};
    String getNom(){return nom;};
    String getPrenom(){return prenom;};
    String getEmail(){return email;};

    // setters
    String setEmail(String email){return this.email = email;};

    void AfficherInfos(){
        System.out.println("nom : " + nom +"\nprenom : " + prenom + "\nemail : " + email);
    };
}
