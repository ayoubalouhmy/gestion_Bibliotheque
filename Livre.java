class Livre {
    private int id;
    private String title;
    private String auteur;
    private int annee_publication;
    private boolean disponible;

    public Livre(int id, String title , String auteur , int annee_publication ){
        this.id=id;
        this.title=title;
        this.auteur=auteur;
        this.annee_publication=annee_publication;
        this.disponible=true;
        
    }
    int getid(){return id;};
    String gettitle(){return title;};
    String getAuteur(){return auteur;};
    int getAnnePublication(){return annee_publication;};
    boolean getdiponibiliter(){return disponible;};
    // setters
    boolean setdisponibiliter(boolean disponible){return this.disponible=disponible;};

    void AfficherInfos(){
        System.out.println("title : " +title +"\n auteur : "+ auteur + "\n annee_publication : "+ annee_publication +"\n disponible : "+ disponible);
    };    
}
