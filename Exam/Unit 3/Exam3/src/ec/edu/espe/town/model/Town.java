/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.town.model;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Town {
    
   private String name ;
   private int  averageage;
   private String skinColor;
   private int habitantes;
   private int extensionofterritory;

    public Town (String name, int averageage, String skinColor, int habitantes, int weighextensionofterritory) {
        this.name = name;
        this.averageage = averageage;
        this.skinColor = skinColor;
        this.habitantes = habitantes;
        this.extensionofterritory =weighextensionofterritory ;
    }


   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the averageage
     */
    public int getAverageage() {
        return averageage;
    }

    /**
     * @param averageage the averageage to set
     */
    public void setAverageage(int averageage) {
        this.averageage = averageage;
    }

    /**
  
    /**
     * @return the skinColor
     */
    public String getSkinColor() {
        return skinColor;
    }

    /**
     * @param skinColor the skinColor to set
     */
    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    /**
     * @return the habitantes
     */
    public int getHabitantes() {
        return habitantes;
    }

    /**
     * @param habitantes the habitantes to set
     */
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    /**
     * @return the extensionofterritory
     */
    public float getWighextensionofterritory() {
        return extensionofterritory;
    }

    /**
     * @param weighextensionofterritory the extensionofterritory to set
     */
    public void setWeighextensionofterritory(int weighextensionofterritory) {
        this.extensionofterritory = weighextensionofterritory;
    }

   
    }



