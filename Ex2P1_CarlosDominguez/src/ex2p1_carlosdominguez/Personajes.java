/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_carlosdominguez;

public class Personajes {
    
    String nombre;
    int hp;
    int mp;
    int atkp;
    double defp;
    public Personajes(String nombre, int hp, int mp, int atkp,double defp) {
        this.atkp=atkp;
        this.nombre=nombre;
        this.hp=hp;
        this.mp=mp;
        this.defp=defp;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAtkp(int atkp) {
        this.atkp = atkp;
    }

    public void setDefp(double defp) {
        this.defp = defp;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAtkp() {
        return atkp;
    }

    public double getDefp() {
        return defp;
    }
    
}
