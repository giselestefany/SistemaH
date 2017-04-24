/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import Modelo.HospedeBEAN;
import Modelo.HospedeDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alunos
 */
public class HospedeControle {
       //private ContatoDAO cDAO = new ContatoDAO(); ---> ArrayList
    private HospedeDAO cDAO = new HospedeDAO();
   private int codigo = 0;
    
    
    
    public void cadastrar(HospedeBEAN c) {                
 
        cDAO.cadastrar(c);
    }
    
    public ArrayList<HospedeBEAN> listarALL(){
        return cDAO.listarALL();
       
    }

    public HospedeBEAN localizar(int codigo) {
        return cDAO.localizar(codigo);
    }    
        
    public boolean editar(HospedeBEAN c) {
        return cDAO.editar(c);        
    }
    
    public boolean remover(int codigo) {     
        return cDAO.remover(codigo);
    }
 
}
