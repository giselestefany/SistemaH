/*import Modelo.ConnectionFactory;
import Modelo.ReservaBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservaDAO {

    //armazena o obj de conexão com o BD mySql
    private Connection connection;
    //obj stmt que executa as consultas no BD
    private PreparedStatement stmt;

    public ReservaDAO() {
        //inicializa a conexão com o BD
        this.connection = ConnectionFactory.getConnection();
    }

    public void cadastrar(ReservaBEAN c) {
        String sql = "insert into reserva (resStatusDisponibilidade, resDataChekin, resDataChekout, resValorTotal, ) values (?, ?, ?, ?);";

        try {
            //prepared statement para inserção
            stmt = connection.prepareStatement(sql);

            //seta os valores
            
            stmt.setString(1, c.get());
            stmt.setString(2, c.get());
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCPF());
            

            //executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<ReservaBEAN> listarALL(){
        String sql = "select * from hospede;";
        ArrayList<ReservaBEAN> contatoAL = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);

            //executa
            ResultSet rs = stmt.executeQuery();
            //joga resultado da consulta no arrayList
            while (rs.next()) {
                ReservaBEAN c = new ReservaBEAN();
                c.setCod(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setEndereco(rs.getString(3));
                c.setTelefone(rs.getString(4));
                c.setCPF(rs.getString(5));
                c.setUF(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setCidade (rs.getString(8));
                c.setOrgaoEmissor(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setCEP(rs.getString(11));

                //adiciona os dados no array
                contatoAL.add(c);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contatoAL;
    }

   /* public ReservaBEAN localizar(int codigo) {
        String sql = "select * from reserva where resCodigo = ?;";
        ReservaBEAN c = new ReservaBEAN();
        try {
            //prepared statement para seleção
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo); // passo ele para consulta SQL

            //executa
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                //seta os valores
               c.setHRent(rs.getInt(1));
                c.setNome(rs.getString(2));
                c.setEndereco(rs.getString(3));
                c.setTelefone(rs.getString(4));
                c.setCPF(rs.getString(5));
                c.setUF(rs.getString(6));
                c.setBairro(rs.getString(7));
                c.setCidade (rs.getString(8));
                c.setOrgaoEmissor(rs.getString(9));
                c.setCelular(rs.getString(10));
                c.setCEP(rs.getString(11));

                //contatoAL.add(c);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;

    }

    public boolean editar(ReservaBEAN c) {
        String sql = "update contato set contnome = ?, contendereco = ?, conttelefone = ?,contCPF= ?,contUF= ?,contBairro= ?,contCidade=?,contOrgaoEmissor= ?, contCelular= ?, contCEP = ? where contcod = ?;";
        try {
            /*stmt = connection.prepareStatement(sql);
            stmt.setString(1, c.getAc1());
            stmt.setString(2, c.getAc2());
            stmt.setString(2, c.getAc3());
            stmt.setString(2, c.getAc4());
            stmt.setString(2, c.getAc5());
            stmt.setString(2, c.getAc6());
            stmt.setString(2, c.getAc7());
            stmt.setString(2, c.getAc8());
            stmt.setString(2, c.getAc9());
            
            stmt.setString(3, c.getTelefone());
            stmt.setString(4, c.getCPF());
            stmt.setString(5, c.getUF());
            stmt.setString(6, c.getBairro());
            stmt.setString(7, c.getCidade());
            stmt.setString(8, c.getOrgaoEmissor());
            stmt.setString(9, c.getCelular());
            stmt.setString(10, c.getCEP());


            stmt.setInt(11, c.getCod());
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
        String sql = "delete from contato where contcod = ?;";
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
/*
