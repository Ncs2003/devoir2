package entities;

import java.util.ArrayList;

public class adresses {
    private int id;
    private String ville; 
    private String quartier; 
    private String numvila;
     
    ArrayList<client> clientList=new ArrayList<>();
   
    public ArrayList<client> getClientList() {
        return clientList;
    }
    public void setClientList(ArrayList<client> clientList) {
        this.clientList = clientList;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVille() {
        return ville;
    }
    public void setVille(String ville) {
        this.ville = ville;
    }
    public String getQuartier() {
        return quartier;
    }
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }
    public String getNumvila() {
        return numvila;
    }
    public void setNumvila(String numvila) {
        this.numvila = numvila;
    }
    
}
