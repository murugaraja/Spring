package com.vaannila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.vaannila.domain.Forum;

public class JDBCForumDAOImpl implements ForumDAO {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void insertForum(Forum forum) {
		String query = "INSERT INTO FORUMS (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (?,?,?)";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, forum.getForumId());
			preparedStatement.setString(2, forum.getForumName());
			preparedStatement.setString(3, forum.getForumDesc());
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	
	public Forum selectForum(int forumId) {
		String query = "SELECT * FROM FORUMS WHERE FORUM_ID=?";
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		try {
			connection = dataSource.getConnection();
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, forumId);
			resultSet = preparedStatement.executeQuery();
			Forum forum = null;
			if(resultSet.next())
			{
				forum = new Forum(resultSet.getInt("FORUM_ID"),resultSet.getString("FORUM_NAME"),resultSet.getString("FORUM_DESC"));
			}
			return forum;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}