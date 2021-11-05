package entities;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

// Generates AccountNumber(Primary key) for account based on custom logic
public class AccountNumberGenerator extends IdentityGenerator {
	final String PREFFIX = "ApnaBank";
	final String ACCOUNT_SEQUENCE_ID = "account_id_sequence";

	@Override
	public Serializable generate(SharedSessionContractImplementor s, Object obj) {
		// Logic to generate customize primary key
		// get sequence next value
		// append "ApnaBank"+ sequence_next_value

		String primaryKey = PREFFIX;
		int accId=-1;

		// Get sequence next value
		// Create Jdbc connection using SharedSessionContractImplementor objcet 's'
		Connection con = s.connection();
		try {
			Statement statement = con.createStatement();
			String query=String.format("select nextval('%s')", ACCOUNT_SEQUENCE_ID);
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) 
			{
				accId = rs.getInt(1);
			}
			primaryKey+=accId;
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}	

		return primaryKey;
	}

}
