/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import modelo.FuncionarioBEAN;
import modelo.FuncionarioDAO;

/**
 *
 * @author Alunos
 */
public class FuncionarioControle {
    //private ContatoDAO cDAO = new ContatoDAO(); ---> ArrayList
    private FuncionarioDAO cDAO = new FuncionarioDAO();
   private int codigo = 0;
    
   
    public void cadastrar(FuncionarioBEAN c) {               
     
        cDAO.cadastrar(c);
    }
    
    public ArrayList<FuncionarioBEAN> listarALL(){
      
            return cDAO.listarALL();
      
    }

    public FuncionarioBEAN localizar(int codigo) {
        return cDAO.localizar(codigo);
    }    
        
    public boolean editar(FuncionarioBEAN c) {
        return cDAO.editar(c);        
    }
    
    public boolean remover(int codigo) {     
        return cDAO.remover(codigo);
    }
}
