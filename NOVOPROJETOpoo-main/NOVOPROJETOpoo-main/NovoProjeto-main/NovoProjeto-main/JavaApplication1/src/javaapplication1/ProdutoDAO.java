package javaapplication1;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProdutoDAO {
    public void adicionarProduto(Produto produto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO Produto(valor, nome, categoria) VALUES(?,?,?)");
            stmt.setDouble(1, produto.getValor());
            stmt.setString(2, produto.getNome());
            stmt.setString(3, produto.getCategoria());
            

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }

    public List<Produto> listarProdutos() {
        List<Produto> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Produto ORDER BY idProduto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto p1 = new Produto(rs.getInt("idProduto"),
                        //String nome, String telefone, String endereco, int cpf
                        rs.getDouble("valor"), rs.getString("nome"), rs.getString("categoria"));
                listaRetorno.add(p1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    


    public Produto getProdutoPeloId(int idProduto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM Produto WHERE idProduto=?");
            stmt.setInt(1, idProduto);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Produto pro = new Produto(rs.getInt("idProduto"),
                        rs.getDouble("valor"), rs.getString("nome"), rs.getString("categoria"));
                return pro;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }

    public void updateProduto(Produto produto) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE Produto SET valor=" +produto.getValor() + "',nome ='" + produto.getNome() +"', categoria ='" + produto.getCategoria() +"' WHERE (idProduto ='" + produto.getIdProduto() + "')'");
           
            //stmt.setString(1, Produto.getValor());
            //stmt.setString(2, Produto.getNome());
            //stmt.setString(3, Produto.getCategoria());
            //stmt.setInt(4, Produto.getIdProduto());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }
    public void deletarProduto(int idProduto) {

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM Produto WHERE idProduto=?");
            stmt.setInt(1, idProduto);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
