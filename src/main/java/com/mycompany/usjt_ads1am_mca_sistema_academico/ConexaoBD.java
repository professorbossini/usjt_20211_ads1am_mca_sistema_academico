/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usjt_ads1am_mca_sistema_academico;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexaoBD {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "usjt_20211_ads1am_mca3_sistema_academico";
    private static String usuario = "rodrigo";
    private static String senha = "1234";
    
    //cláusula catch or declare
    public static Connection obterConexao () throws Exception{
        //jdbc:mysql://localhost:3006/usjt_2021_ads1am_mca3_sistema_academico
        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host, porta, db 
        );
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }
}
