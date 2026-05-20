package models;
import java.text.DecimalFormat;

public class Bouteille {
    // attributs
    private String nom;
    private double prix;
    private double contenance;
    private int remplissage;
    private boolean enVerre;

    // constructeur
    public Bouteille(String nom, double prix, double contenance, int remplissage, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = remplissage;
        this.enVerre = enVerre;
    }
    // getters et setters
    public String getNom() {
        return "Bouteille '"+nom+"' ";
    }
    public String getPrix(){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        decimalFormat.format(prix);
        return "à "+prix +" Frs - ";
    }
    public String getContenance(){
        return "de " +contenance +"L";
    }
    public String getRemplissage(){
        String rempli = "";
        if (remplissage == 100) {
            rempli = "pleine";
        }
        else if(remplissage == 0){
            rempli = "vide";
        }
        else{
            rempli = "entamée";
        }
        return rempli;
    }
    public String getVerre(){
        String verre ="";
        if (enVerre == true) {
            verre = "verre";
        }
        else{
            verre = "plastique";
        }
        return " en "+verre;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setPrix(double prix){
        this.prix = prix;
    }
    public void setContenance(double contenance){
        this.contenance = contenance;
    }
    public void setRemplissage(int remplissage){
        this.remplissage = remplissage;
    }
    
}