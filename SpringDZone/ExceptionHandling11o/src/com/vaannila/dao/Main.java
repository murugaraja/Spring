package com.vaannila.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vaannila.domain.Forum;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ForumDAO forumDAO = (ForumDAO) context.getBean("forumDAO");
		Forum springForum = new Forum(1, "Spring Forum","Discuss everything related to Spring");
		
		try {
			forumDAO.insertForum(springForum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			System.out.println(forumDAO.selectForum(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}