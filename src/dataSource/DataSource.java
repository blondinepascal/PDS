package dataSource;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;

public class DataSource implements ConnectionPoolDataSource,javax.sql.DataSource {
	
	//a static attribute instance of JDBCConnectionPool
	static JDBCConnectionPool jdbcconnectionpool;
	
	
	//a static method that returns a connection of the attribute
	public static Connection returnConnectionpool() {
		
		return null;
	}
	
	
	//a static method that puts a connection back into the attribute
	public static void putConnectionpool() {
		
		
	}
	
	//a static method which closes the attribute
	public static void closeConnectionpool() {
		
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