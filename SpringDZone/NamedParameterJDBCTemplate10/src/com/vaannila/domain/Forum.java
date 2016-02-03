package com.vaannila.domain;

public class Forum {

	private int forumId;
	private String forumName;
	private String forumDesc;

	public Forum(int forumId, String forumName, String forumDesc) {
		this.forumId = forumId;
		this.forumName = forumName;
		this.forumDesc = forumDesc;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
	}

	public String getForumName() {
		return forumName;
	}

	public void setForumName(String forumName) {
		this.forumName = forumName;
	}

	public String getForumDesc() {
		return forumDesc;
	}

	public void setForumDesc(String forumDesc) {
		this.forumDesc = forumDesc;
	}
	
	public String toString() {
		return forumId+" "+forumName+" "+forumDesc;
	}

}
