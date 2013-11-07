package database;

import model.Actor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * User: Mariola
 * Date: 07.11.13
 */
public class ActorDao {
    private static String dbUrl = "jdbc:mysql://localhost/sakila";
    private static String user = "root";
    private static String pass = "root";

    public static List<Actor> getAllActors(){
        List<Actor> actorList = new ArrayList<Actor>();

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(dbUrl, user, pass);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM actor");

            while (resultSet.next()){
                int id = resultSet.getInt("actor_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                Actor actor = new Actor(id, firstName, lastName);
                actorList.add(actor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return actorList;
    }
}
