package DB;

import Animals.Cat;
import Services.Service;

import java.sql.*;

public class CatDB {
    private static CatDB cdb = null;
    private final DBConnection DBconn = DBConnection.getInstance();


    private CatDB() {}

    public static CatDB getInstance() {
        if(cdb == null)
            cdb = new CatDB();
        return cdb;
    }

    public void getCats (Service s) throws SQLException {
        try {
            Statement st = DBconn.getConn().createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM cats");
            while (rs.next()) {
                s.cs.addCat(
                        new Cat(rs.getString("name"),
                                rs.getString("sex"),
                                rs.getInt("age"),
                                rs.getFloat("weight"),
                                rs.getBoolean("trained"),
                                rs.getString("fur_pattern"),
                                rs.getString("fur_color"))
                );
            }
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertCat(Cat cat) {
        if(DBconn.getConn() != null) {
            try {
                Statement st = DBconn.getConn().createStatement();
                st.execute("INSERT INTO cats VALUES(" +
                        "'" + cat.getName() + "'," +
                        "'" + cat.getSex() + "'," +
                        cat.getAge() + "," +
                        cat.getWeight() + "," +
                        cat.getTrained() + "," +
                        "'" + cat.getFur_pattern() + "'," +
                        "'" + cat.getFur_color() + "')");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void deleteCatById(String name) {
        if(DBconn.getConn() != null) {
            try {
                Statement st = DBconn.getConn().createStatement();
                st.executeQuery("DELETE FROM cats WHERE Name=" + name + ";");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateCatDB(String field, String value, String name) {
        if(DBconn.getConn() != null) {
            try {
                Statement st = DBconn.getConn().createStatement();
                st.executeQuery("UPDATE cats SET " +
                        field + "=" + value +
                        " WHERE Name=" + "\"" + name + "\"");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
