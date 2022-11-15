package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.opencsv.CSVWriter;

public class DataBaseUtility {

	// Declare a private static Connection obj of Connection Class
	private static Connection connection; // connect our script to DB

	// Declare a private static Statement obj of Statement Class
	private static Statement statement; // Execute the query we passing

	// Declare a private static ResultSet obj of ResultSet class
	private static ResultSet resultSet; // Store the retrieved data from query execution

	// Syntax for postgresql url : jdbc:postgresql://host:port/databaseName

	private static String url = "jdbc:postgresql://localhost:5432/dvdrental";

	// User name for DB
	private static String userName = "postgres";

	// password for DB
	private static String password = "root";

	// Create Connection to DB

	public static void setupDBConnection() {

		try {

			connection = DriverManager.getConnection(url, userName, password);

		} catch (SQLException e) {

			e.printStackTrace();

		}
	}

	public static ResultSet runQuery(String query) {

		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery(query);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resultSet;

	}

	public static void returnResult() {

		try {
			while (resultSet.next()) {

				// write any code to do with Result
				// you can print it to console
				// you can store it in an object array
				// you write it to excel or csv file

				CSVWriter csvWriter;

				// change the path based on your testdatOutput folde path
				String output = System.getProperty("user.dir") + "\\output\\book.csv";
				File file = new File(output);
				try {
					// FileWriter class to write in CSV file
					FileWriter filewriter = new FileWriter(file);
					csvWriter = new CSVWriter(filewriter);
					csvWriter.writeAll(resultSet, true);
					csvWriter.close();

				} catch (SQLException e) {

				} catch (IOException e) {

				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// close the DB connection
	public static void closeDBConnection() {
		if (connection != null) {
			try {
				connection.close();
			} catch (Exception e) {

			} finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
