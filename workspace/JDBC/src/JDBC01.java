import db.driver.DBDriver;
import db.driver.MyMySQLDriver;
import db.driver.MyOracleDriver;

public class JDBC01 {
	public static void main(String[] args) {

		DBDriver driver = new MyOracleDriver();
		driver.getConnect();
		
		driver =new MyMySQLDriver(); 
		driver.getConnect();
	}

}
