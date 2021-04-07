/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.wildAnimalSystem.model;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Lion {
   private String color;
   private String especie;
   private String habitat;
   private String feeding;
   private int age;
   private int weight;

    public Lion(String color, String especie, String habitat, String feeding, int age, int weight) {
        this.color = color;
        this.especie = especie;
        this.habitat = habitat;
        this.feeding = feeding;
        this.age = age;
        this.weight = weight;
    }


   
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * @return the habitat
     */
    public String getHabitat() {
        return habitat;
    }

    /**
     * @param habitat the habitat to set
     */
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    /**
     * @return the feeding
     */
    public String getFeeding() {
        return feeding;
    }

    /**
     * @param feeding the feeding to set
     */
    public void setFeeding(String feeding) {
        this.feeding = feeding;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

   
    }
   
