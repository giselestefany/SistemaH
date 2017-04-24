/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class FuncionarioDAO {

    //armazena o obj de conexão com o BD mySql
    private Connection connection;
    //obj stmt que executa as consultas no BD
    private PreparedStatement stmt;

    public FuncionarioDAO() {
        //inicializa a conexão com o BD
        this.connection = ConnectionFactory.getConnection();
    }

    public void cadastrar(FuncionarioBEAN c) {
        String sql = "insert into funcionario (funSenha, funLogin, funNome,  funCPF, funFuncao, funAdimissao, funDemissao, funDataNascimento, funTelefone,funEndereco, funObs) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";

        try {
            //prepared statement para inserção
            stmt = connection.prepareStatement(sql);

            //seta os valores
            stmt.setString(1, c.getSenha());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getNome());
            stmt.setString(4, c.getCpf());
            stmt.setString(5, c.getFuncao());
            stmt.setString(6, c.getAdimissao());
            stmt.setString(7, c.getDemissao());
            stmt.setString(8, c.getDataNascimento());
            stmt.setString(9, c.getTelefone());
            stmt.setString(10, c.getEndereco());
            stmt.setString(11, c.getObservacao());

            //executa
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<FuncionarioBEAN> listarALL() {
        String sql = "select * from funcionario;";
        ArrayList<FuncionarioBEAN> funcionarioAL = new ArrayList<>();
        try {
            stmt = connection.prepareStatement(sql);

            //executa
            ResultSet rs = stmt.executeQuery();
            //joga resultado da consulta no arrayList
            while (rs.next()) {
                FuncionarioBEAN c = new FuncionarioBEAN();
                c.setCodigo(rs.getInt(1));
                c.setSenha(rs.getString(2));
                c.setLogin(rs.getString(3));
                c.setNome(rs.getString(4));
                c.setCpf(rs.getString(5));
                c.setFuncao(rs.getString(6));
                c.setAdimissao(rs.getString(7));
                c.setDemissao(rs.getString(8));
                c.setDataNascimento(rs.getString(9));
                c.setTelefone(rs.getString(10));
                c.setEndereco(rs.getString(11));
                c.setObservacao(rs.getString(12));

                funcionarioAL.add(c);
            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return funcionarioAL;
    }

    public FuncionarioBEAN localizar(int codigo) {
        String sql = " select * from funcionario where funCodigo = ?";
        FuncionarioBEAN c = new FuncionarioBEAN();
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setInt(1, codigo);
            //executa
            ResultSet rs = stmt.executeQuery();
         
            //joga resultado da consulta no arrayList
            while (rs.next()) {
                c.setCodigo(rs.getInt(1));
                c.setSenha(rs.getString(2));
                c.setLogin(rs.getString(3));
                c.setNome(rs.getString(4));
                c.setCpf(rs.getString(5));
                c.setFuncao(rs.getString(6));
                c.setAdimissao(rs.getString(7));
                c.setDemissao(rs.getString(8));
                c.setDataNascimento(rs.getString(9));
                c.setTelefone(rs.getString(10));
                c.setEndereco(rs.getString(11));
                c.setObservacao(rs.getString(12));

            }
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

    public boolean editar(FuncionarioBEAN c) {
        String sql = " update funcionario set funSenha = ?, funLogin = ? , funNome = ?,funCPF = ?, funFuncao = ?, funAdimissao = ?, funDemissao = ?, funDataNascimento = ?, funTelefone = ?, funEndereco = ? , funObs = ? where funcodigo = ? ";
        try {

            stmt = connection.prepareStatement(sql);

            stmt.setString(1, c.getSenha());
            stmt.setString(2, c.getLogin());
            stmt.setString(3, c.getNome());
            stmt.setString(4, c.getCpf());
            stmt.setString(5, c.getFuncao());
            stmt.setString(6, c.getAdimissao());
            stmt.setString(7, c.getDemissao());
            stmt.setString(8, c.getDataNascimento());
            stmt.setString(9, c.getTelefone());
            stmt.setString(10, c.getEndereco());
            stmt.setString(11, c.getObservacao());

            stmt.setInt(12, c.getCodigo());

            int linhasAtualizadas = stmt.executeUpdate();
            stmt.close();
            if (linhasAtualizadas > 0) {
                System.out.println("Foram alterados " + linhasAtualizadas);
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean remover(int codigo) {
        String sql = " delete from funcionario where funCodigo = ?";

        try {
            //prepared statement para inserção
            stmt = connection.prepareStatement(sql);

            //seta os valores
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
