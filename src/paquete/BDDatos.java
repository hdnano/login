package paquete;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

public class BDDatos {

	private static String db_ = "Nombre Base de Datos";
	private static String login_ = "Usuario de la Base de Datos";
	private static String password_ = "Contrasena";
	private static String url_ = "jdbc:mysql :// 192.168.1.5/"+db_;
	private static Connection connection_;
	public BDDatos() {
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection_ = DriverManager.getConnection(url_ ,
			login_ , password_);
			if (connection_ != null){
			connection_.createStatement ();
			System.out.println("Conexion a base de datos " + db_ + " correcta.");
			}
			
			else
			System.out.println("Conexion fallida.");
			} 
		
		    catch (SQLException e) {e.printStackTrace ();}
			catch (ClassNotFoundException e) {e.printStackTrace ();}
			catch (Exception e) {e.printStackTrace ();}
	}
	
}
