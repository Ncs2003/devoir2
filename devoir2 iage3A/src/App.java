import java.util.List;
import java.util.Scanner;

import entities.client;
import services.cltservices;
import services.java.clientservices;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("1-creer un client");
            System.out.println("2-Lister les clients"); 
            System.out.println("3-ajouter une adresse"); 
            System.out.println("4-lister les adresses");
            System.out.println("5-Quitter"); 
             choix=sc.nextInt();
             sc.nextLine();
            switch (choix) {
                case 1:
                     System.out.println("Entrer un nom");
                     String numero=sc.nextLine(); 
                     System.out.println("Entrer un Telephone");
                     String tel=sc.nextLine();  
                     System.out.println("Entrer une email");
                    client cl=new client();
                      cl.setNom(nom);
                      cl.setTelephone(tel);
                      cl.setemail(email);
                    cltservices.creerclient(cl);
                    break;
                
                case 2:
                    List<client> client=  cltservices.listerclient();
                     for (client client: clients) {
                          System.out.println("Nom "+ client.getNom());
                          System.out.println("Telephone "+ client.getTelephone());
                          System.out.println("email "+ client.getemail());
                          System.out.println("=================================");
                     }
                    break;

                
    }
}
}
}