/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lenovo
 */
public class Pokemon {
    private String name;
    private boolean shiny;
    private int level;

    public Pokemon(String name, boolean shiny, int level) {
        this.name = name;
        this.shiny = shiny;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public boolean isShiny() {
        return shiny;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShiny(boolean shiny) {
        this.shiny = shiny;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", shiny=" + shiny +
                ", level=" + level +
                '}';
    }
}
