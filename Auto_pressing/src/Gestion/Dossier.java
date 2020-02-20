/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Client;

/**
 *
 * @author RZR
 */
public class Dossier implements Serializable {
      public List<Client> client;
      
       public Dossier() {
        client= new ArrayList<>();
    }
         //methodes
    public void ajouter(Client c){
        client.add(c);
    }
     public int rechercher(String m){
      int c=-1;
      //pour chaque personne se trouvant dans la liste
        for (Client  clien : client) {
            if(m.equalsIgnoreCase(clien.getCode())){
                c=client .indexOf(clien);
                break;
            }           
        }
      return c;
    }
        public void modifier(Client c, int i){ //remplace i par c
        client.set(i, c);
    }
          public  void supprimer(int c){
        client.remove(c);
          }
}
