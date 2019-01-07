
package dataSource;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Vector;
import java.util.logging.Logger;

import javax.sql.*;
import javax.sql.DataSource;

public class JDBCConnectionPool implements ConnectionPoolDataSource,DataSource {
	
	//an attribute which enable to collect physical connections, instance of the Connection class
	public  Vector<Connection> connection ;
	
	public JDBCConnectionPool(Vector<Connection> connection) {
		
		this.connection = connection;
		
	}
	
	
	// a method that "fills" the attribute with a number of instances of the Connection class
	public void  fillConnection() {
		
		this.connection.addAll(connection);
		
	}
	
	//a method that returns a Connection object taken in the attribute
	public Connection connectiontool() {
		
		
		return null;
	}
	
	// a method with an instance parameter of the Connection class that puts this object in the attribute
	public void resetConnection(Connection connection) {
		
	}
	
	//a method that closes all attribute connections
	public void closeConnection() {
		
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PrintWriter getLogWriter() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoginTimeout() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PooledConnection getPooledConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PooledConnection getPooledConnection(String arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLogWriter(PrintWriter arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLoginTimeout(int arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isWrapperFor(Class<?> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <T> T unwrap(Class<T> arg0) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.sql.Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public java.sql.Connection getConnection(String arg0, String arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
