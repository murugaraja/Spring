package com.vaannila.dao;

import com.vaannila.domain.Forum;

public interface ForumDAO {

	public void insertForum(Forum forum);
	public Forum selectForum(int forumId);
	
}
