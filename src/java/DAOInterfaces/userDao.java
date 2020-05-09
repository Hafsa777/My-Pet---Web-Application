/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterfaces;

import java.io.InputStream;
import java.util.List;
import model.User;


public interface userDao {
   
    public void addUser(User u1,InputStream in);
    public void updateUser(User u1,InputStream in);
    public void deleteUser(int id);
    public List<User> getAllUser();
    public User findById(int id);
    
}
