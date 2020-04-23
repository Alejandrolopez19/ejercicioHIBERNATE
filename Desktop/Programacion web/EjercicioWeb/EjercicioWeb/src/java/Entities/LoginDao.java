/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Dao.UsuarioDAO;
/**
 *
 * @author Alejandro Lopez
 */
public class LoginDao {
    public String aunthenticateUser(Usuario usuario){
    
    UsuarioDAO usuarioDAO= new HibernateUsuarioDAO();
    Usuario u = usuarioDAO.selectById(usuario.getUsuario());
    
    if(u!=null){
    if(u.getClave().contentEquals(usuario.getClave()));{
    return "SUCCESS";
}
}
return "ERROR";
}
}
