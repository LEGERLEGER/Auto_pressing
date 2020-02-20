/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.*;
import javax.swing.ImageIcon;

/**
 *
 * @author RZR
 */
public class Client implements Serializable {
    private static int n=1;
    
    private String nom;
    private String prenom;
    private String contact;
    private String genre;
    private String code;
    private ImageIcon image;
    private List<Tache> Tache;
    
     public Client() {
        Tache=new ArrayList<>();
    }

    public Client(String nom, String prenom, String contact, String genre, ImageIcon image) {
        this.nom = nom;
        this.prenom = prenom;
        this.contact = contact;
        this.genre = genre;
        this.image = image;
         Tache=new ArrayList<>();
	 generate();
    }
    
   



 

    public String getNom() {
        return nom;
    }
    public String getCode() {
        return code;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getContact() {
        return contact;
    }


    public String getGenre(){
        return genre;
    }
    

    public ImageIcon getImage() {
        return image;
    }

//generation de matricule
     private  String nombre(int a){
         String b=""+a;
         if(a<10){
             b="000"+a;
         }
         else if(a<100){
             b="00"+a;
         }
         else if(a<1000){
             b="0"+a;
         }
             
         return b;
     }   
   public void generate()
    {
        String p=prenom.substring(0, 2);
        String n =nom.substring(0, 1);
      code=p.toUpperCase()+n.toUpperCase()+nombre(this.n);
       this.n++;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public void setImage(ImageIcon image) {
        this.image = image;
    }
}

