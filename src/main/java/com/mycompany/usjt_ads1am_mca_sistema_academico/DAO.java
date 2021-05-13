/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ads1am_mca_sistema_academico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rodrigo
 */
//Data Access Object
public class DAO {
    public boolean existe (Usuario u) throws Exception{
        //1. Especificar comando SQL
        String sql = "SELECT * FROM tb_usuario WHERE nome = ? AND senha = ?";
        
        //2. Abrir uma conexão
        //3. Preparar o comando
        //try with resources
        try (Connection conexao = ConexaoBD.obterConexao();
                PreparedStatement ps = conexao.prepareStatement(sql);){
            //4. Substituir os placeholders, ou seja, os símbolos ?
            ps.setString(1 , u.getNome());
            ps.setString(2, u.getSenha());
            //5. Executar o comando
            try (ResultSet rs = ps.executeQuery()){
                //6. Tratar o resultado
                return rs.next();
            }
        }
        
    }
}
