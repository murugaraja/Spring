package com.vaannila.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import com.vaannila.domain.Forum;

public class ForumDAOImpl implements ForumDAO {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setDataSource(DataSource dataSource) {
	    this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public void insertForum(Forum forum) {
		String query = "INSERT INTO FORUMS (FORUM_ID, FORUM_NAME, FORUM_DESC) VALUES (:forumId,:forumName,:forumDesc)";
		Map namedParameters = new HashMap();
		namedParameters.put("forumId", Integer.valueOf(forum.getForumId()));
		namedParameters.put("forumName", forum.getForumName());
		namedParameters.put("forumDesc", forum.getForumDesc());
		namedParameterJdbcTemplate.update(query, namedParameters);
	}
	
	public Forum selectForum(int forumId) {

		String query = "SELECT * FROM FORUMS WHERE FORUM_ID=:forumId";
		SqlParameterSource namedParameters = new MapSqlParameterSource("forumId", Integer.valueOf(forumId));

		return (Forum) namedParameterJdbcTemplate.queryForObject(query,namedParameters, new RowMapper() {
			public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				return new Forum(resultSet.getInt("FORUM_ID"),resultSet.getString("FORUM_NAME"),resultSet.getString("FORUM_DESC"));
			}
		});
	}
}
