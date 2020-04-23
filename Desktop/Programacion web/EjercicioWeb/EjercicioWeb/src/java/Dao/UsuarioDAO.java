package Dao;

import Entities.Usuario;
import java.util.List;


public interface UsuarioDAO {
    
    public Usuario selectById(String Usuario);
    
    public List<Usuario> selectAll();
    
     public void insert(Usuario usuario);
     public void updade(Usuario usuario);
     public void delate(Usuario usuario);

}
