//Fila 1, asiento 14
package ex2p1_carlosdominguez;
import java.util.*;
import java.util.ArrayList;
public class Ex2P1_CarlosDominguez {
    
    static Scanner sc = new Scanner (System.in);
    static Random rm =new Random ();
    static ArrayList <Personajes> party =new ArrayList<>();
    static ArrayList <Personajes> reserva =new ArrayList<>();
    static ArrayList <Items> mochila = new ArrayList<>();
    static int hp;
    static int mp;
    static int atkp;
    static int defp;
    static String nombre;
    
    public static void main(String[] args) {
        
        //add(new Personajes("nom",HP,MP,atk,defp)),;
        
        party.add(new Personajes("Sora",300,300,75,15));
        party.add(new Personajes("Donald",150,450,45,10));
        party.add(new Personajes("Goofy",450,100,150,50));
        
        reserva.add(new Personajes("Mickey",100,500,150,35));
        reserva.add(new Personajes("Roxas",300,300,15,75));
        reserva.add(new Personajes("Kairi",200,200,50,15));
        
        mochila.add(new Items("Pocion",50,0));
        mochila.add(new Items("Ether",0,50));
        mochila.add(new Items("Elixir",100,100));
        
        
        System.out.println("Bienvenido");
        System.out.println("    A ");
        System.out.println("Kingdom Hearts Re-Re:Coded!");
        
        boolean endf =false;
        int contr=0;
  
        while (endf==false){
            contr+=1;
            System.out.println("Cuarto : "+contr);
            int tipoc = rm.nextInt(((5-1)+1)+1);
            if (tipoc == 0){
                tipoc = 1;
            }
            impri(party);
            switch (tipoc){
                case 1 : {
                   //pelea contra heartless 
                   int numHeartless =rm.nextInt(((3-1)+1)+1);
                   if (numHeartless>3){
                       numHeartless = 3;
                   }else if(numHeartless<=0){
                       numHeartless = 1;
                   }
                   
                    
                   break;
                }
                case 2 : {
                    //cofre con pocion
                    
                    
                    break;
                }
                case 3 : {
                    //cofre con ether
                    
                    
                    
                    break;
                }
                case 4 : {
                    //cofre con elixir
                    
                    
                    
                    break;
                }
                case 5 : {
                    //encuentra amigos y le quitan de manera aleatoria sus items
                    
                    
                    break;
                }
                
            }
            System.out.println("Desea continuar (S/N) :");
            char relleno = sc.next().charAt(0);
            if (contr == 20){
                System.out.println("Consigo completar el castillo Oblivion");
                System.out.println("Felicidades");
                endf = true;
            }
        }
        // def es igual a atk = atk-atk*def, y el hp = hp-atk
    }
    public static void impri(ArrayList <Personajes> party){
        for(int i=0;i<party.size();i++){
            System.out.println(party.get(i));
        }
    }
    
}
