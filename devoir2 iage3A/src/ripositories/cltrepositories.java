package ripositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.client;

public class cltrepositories extends Database{
    private final  String SQL_SELECT_ALL="select * from client" ;
    private final  String SQL_INSERT="INSERT INTO client (nom_client, tel_client,email_client) VALUES (?,?,?)";

    private cltrepositories cltrepositories=new cltrepositories();
     public void insertclient(client client){
        cltrepositories.insertclient(client);

    }
     public List<client>getAllclient(){
         List<client> agences=new ArrayList<>();
       try {
           openConnexion();
           initPreparedStatement(SQL_SELECT_ALL);
           ResultSet rs= executeSelect();
             while (rs.next()) {
               
                 client ag=new client();
                 client.setId(rs.getInt("id_client"));
                 client.setNomcomplet(rs.getString("nom_client"));
                 client.setTelephone(rs.getString("tel_client"));
                 client.setEmail(rs.getString("email_client"));
                
                 client.add(client);
                
             }
             rs.close();
           closeConnexion();
        }
       catch (SQLException e) {
        System.out.println("Erreur de Connexion a la BD");
      }
        return  client;
    }

        
    }

