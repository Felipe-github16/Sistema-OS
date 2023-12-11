/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.infof.dal;

import java.sql.*;

/*
 * @author Felipe Vieira
 */
public class ModuloConexao {

    //método responsavel por estavelecer a conexão com o banco
    public static Connection conector() {
        Connection conexao = null;
        //a linha abaiixo chama o driver que foi importado para bibioteclas
        String driver = "com.mysql.cj.jdbc.Driver";
        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfoF";
        String user = "root";
        String password = "";
        //estabelecendo a conexão com o banco de dados
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
