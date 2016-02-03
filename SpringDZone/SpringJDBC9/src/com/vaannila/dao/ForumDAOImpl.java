package com.vaannila.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.vaannila.domain.Forum;

public class ForumDAOImpl implements ForumDAO {

	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public void insertForum(Forum forum) {
		String query = "INSERT INTO FORUMS (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (?,?,?)";
		jdbcTemplate.update(query, new Object[] {
						Integer.valueOf(forum.getForumId()), forum.getForumName(),forum.getForumDesc() 
				});
	}

	public Forum selectForum(int forumId) {
		String query = "SELECT * FROM FORUMS WHERE FORUM_ID=?";
		return (Forum) jdbcTemplate.queryForObject(query, new Object[] { Integer.valueOf(forumId) }, new RowMapper() {
					public Object mapRow(ResultSet resultSet, int rowNum)throws SQLException {
						return new Forum(resultSet.getInt("FORUM_ID"),resultSet.getString("FORUM_NAME"), resultSet.getString("FORUM_DESC"));
					}
				});
	}
}