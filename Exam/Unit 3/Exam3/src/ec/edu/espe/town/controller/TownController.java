/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.town.controller;
import ec.edu.espe.town.model.Town;

import Utlis.FileManager;



/**
 *
 * @author HP-LAPTOP-14
 */
public class TownController{
    
  public static void save(Town town){
        String data = town.getName()+ " , "+town.getAverageage()+ " , "+town.getSkinColor()+ " , "+town.getHabitantes()+ " , "+town.getWighextensionofterritory();
        FileManager.save(data,"Towns" );
    }
public String read () {
        String data;
        data = FileManager.read("Towns");
        return data;
  }
}
    
  
    
      
         
        
       




