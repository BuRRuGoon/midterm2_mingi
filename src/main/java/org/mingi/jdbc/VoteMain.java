package org.mingi.jdbc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VoteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"vote-context.xml");
		VoteService pollService = context.getBean("voteService", VoteService.class);
		
		//pollService.votefor();
		pollService.listVotes();
		context.close();
	}

}
