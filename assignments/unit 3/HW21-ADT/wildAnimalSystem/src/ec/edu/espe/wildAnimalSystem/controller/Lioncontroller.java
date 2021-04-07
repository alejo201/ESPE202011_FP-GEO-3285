/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.wildAnimalSystem.controller;

import Utils.FileManager;
import ec.edu.espe.wildAnimalSystem.model.Lion;

/**
 *
 * @author HP-LAPTOP-14
 */
public class Lioncontroller {
    public void save (Lion lion){
        
        String data = lion.getColor()+ " , "+lion.getEspecie()+ " , "+lion.getFeeding()+ " , "+lion.getHabitat()+ " , "+lion.getAge()+ " , "+lion.getWeight();
        FileManager.save(data,"Lions" );
    }
public String read () {
        String data;
        data = FileManager.read("Lions");
        return data;
  }
}

