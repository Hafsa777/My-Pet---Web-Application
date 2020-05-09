/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterfaces;

import java.io.InputStream;
import static java.util.Collections.list;
import java.util.List;
import model.pet;


public interface petDAO {
    
    public void addPet(pet p1,String imageName);
    public void updatePet(pet p1);
    public void deletePet(int id);
    public pet findById(int id);
    public List<pet> findAllPet();
    public void insertImage(int id,InputStream in,String imageName);
     public void editImage(int id,InputStream in,String imageName);
    
  
    
    
}
