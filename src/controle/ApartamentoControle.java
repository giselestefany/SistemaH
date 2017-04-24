
package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.ApartamentoBEAN;
import modelo.ApartamentoDAO;

public class ApartamentoControle {

    private ApartamentoDAO cDAO = new ApartamentoDAO();
    

    public void cadastrar(ApartamentoBEAN c) {
        cDAO.cadastrar(c);
    }

    public ArrayList<ApartamentoBEAN> listarALL() {
            return cDAO.listarALL();
    }

    public ApartamentoBEAN localizar(int codigo) {
        return cDAO.localizar(codigo);
    }

    public boolean editar(ApartamentoBEAN c) {
        return cDAO.editar(c);
    }

    public boolean remover(int codigo) {
        return cDAO.remover(codigo);
    }

}
