/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edition_recherche;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author paulferrand
 */
public class Recherche {
    Connection connec;

    public Recherche(Connection conn) throws SQLException {
        connec = conn;
    }
}
