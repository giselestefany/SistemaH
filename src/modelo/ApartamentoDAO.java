package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ApartamentoDAO {

    private Connection connection;
    private PreparedStatement stmt;

    public ApartamentoDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    public void cadastrar(ApartamentoBEAN c) {
        String sql = "insert into apartamento (apaNumero, apaNome,apaNumeroCamaSolteiro, apaNumeroCamaCasal, apaPrecoDiaria, apaAndar, apaFrigobar, apaBanheiraHidromassagem, apaVentilador, apaArCondicionado, apaNumeroHospedes, apaTipoQuarto, apaObs) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getNumero());
            stmt.setString(2, c.getNome());
            stmt.setInt(3, c.getNumCamaSolteiro());
            stmt.setInt(4, c.getNumCamaCasal());
            stmt.setFloat(5, c.getPrecoDiaria());
            stmt.setInt(6, c.getAndar());
            stmt.setBoolean(7, c.isFrigobar());
            stmt.setBoolean(8, c.isBanheiraHidromassagem());
            stmt.setBoolean(9, c.isVentilador());
            stmt.setBoolean(10, c.isArCondicionado());
            stmt.setInt(11, c.getNumHospedes());
            stmt.setString(12, c.getTipoQuarto());
            stmt.setString(13, c.getObs());

            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ApartamentoBEAN> listarALL(){
        String sql = "select * from apartamento;";
        
        ArrayList<ApartamentoBEAN> apartamentoAL = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);

            //executa
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                ApartamentoBEAN c = new ApartamentoBEAN();
                c.setCodigo(rs.getInt(1));
                c.setNumero(rs.getInt(2));
                c.setNome(rs.getString(3));
                c.setNumCamaSolteiro(rs.getInt(4));
                c.setNumCamaCasal(rs.getInt(5));
                c.setPrecoDiaria(rs.getFloat(6));
                c.setAndar(rs.getInt(7));
                c.setFrigobar(rs.getBoolean(8));
                c.setBanheiraHidromassagem(rs.getBoolean(9));
                c.setVentilador(rs.getBoolean(10));
                c.setArCondicionado(rs.getBoolean(11));
                c.setNumHospedes(rs.getInt(12));
                c.setTipoQuarto(rs.getString(13));
                 c.setObs(rs.getString(14));

                apartamentoAL.add(c);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return apartamentoAL;
    }

    public ApartamentoBEAN localizar(int codigo) {
        String sql = "select * from apartamento where apaCodigo = ?;";
        ApartamentoBEAN c = new ApartamentoBEAN();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); 

            //executa
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                
                c.setNumero(rs.getInt(2));
                c.setNome(rs.getString(3));
                c.setNumCamaSolteiro(rs.getInt(4));
                c.setNumCamaCasal(rs.getInt(5));
                c.setPrecoDiaria(rs.getFloat(6));
                c.setAndar(rs.getInt(7));
                c.setFrigobar(rs.getBoolean(8));
                c.setBanheiraHidromassagem(rs.getBoolean(9));
                c.setVentilador(rs.getBoolean(10));
                c.setArCondicionado(rs.getBoolean(11));
                c.setNumHospedes(rs.getInt(12));
                c.setTipoQuarto(rs.getString(13));
                 c.setObs(rs.getString(14));

                
                c.setCodigo(rs.getInt(1));

                
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;

    }

    public boolean editar(ApartamentoBEAN c) {
        String sql = "update apartamento set apaNumero = ?, apaNome = ?, apaNumeroCamaCasal = ?, apaNumeroCamaSolteiro = ?, apaPrecoDiaria = ?, apaAndar = ?, apaFrigobar = ?, apaBanheiraHidromassagem = ?, apaVentilador = ?, apaArCondicionado = ?, apaNumeroHospedes = ?,  apaTipoQuarto= ?, apaObs= ? where apaCodigo = ?;";             

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, c.getNumero());
            stmt.setString(2, c.getNome());
            stmt.setInt(3, c.getNumCamaCasal());
            stmt.setInt(4, c.getNumCamaSolteiro());
            stmt.setFloat(5, c.getPrecoDiaria());
            stmt.setInt(6, c.getAndar());
            stmt.setBoolean(7, c.isFrigobar());
            stmt.setBoolean(8, c.isBanheiraHidromassagem());
            stmt.setBoolean(9, c.isVentilador());
            stmt.setBoolean(10, c.isArCondicionado());
            stmt.setInt(11, c.getNumHospedes());
            stmt.setString(12, c.getTipoQuarto());
            stmt.setString(13, c.getObs());
            stmt.setInt(14, c.getCodigo());

            
            int linhasAtualizadas = stmt.executeUpdate();
            stmt.close();
            if (linhasAtualizadas > 0) {
                System.out.println("Foram alterados: " + linhasAtualizadas);
            }
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean remover(int codigo) {
        String sql = "delete from apartamento where apaCodigo = ?;";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo);
            //executa
            stmt.execute();
            stmt.close();
            return true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
