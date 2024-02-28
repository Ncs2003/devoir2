package entities;

public class client {
    private int id;
    private String nomcomplet; 
    private String telephone; 
    private String email;
    public int getId() {
        return id;
    }
    public static void setId(int id) {
        this.id = id;
    }
    public String getNomcomplet() {
        return nomcomplet;
    }
    public static void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }
    public String getTelephone() {
        return telephone;
    }
    public static void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getEmail() {
        return email;
    }
    public static void setEmail(String email) {
        this.email = email;
    }
    public static void add(client ag) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    
}







   

