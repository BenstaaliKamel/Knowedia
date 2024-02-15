package org.example;
import com.mongodb.client.*;
import org.bson.Document;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.mongodb.client.model.Filters.eq;

public class Main {
    public static void login_frame_invoke(){
        SwingUtilities.invokeLater(() -> {
            ModernLoginPage loginPage = new ModernLoginPage();
            loginPage.setVisible(true);
        });
    }
    public static void data_base_connexion(){
        DataBaseConnexion mongodb = new DataBaseConnexion();
        mongodb.data_base_connexion();
    }
    public static void main(String[] args) {
        //data_base_connexion();
        login_frame_invoke();
    }
}