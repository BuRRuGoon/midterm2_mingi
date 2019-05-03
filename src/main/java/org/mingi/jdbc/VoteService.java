package org.mingi.jdbc;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

@Service
public class VoteService {
	
	@Autowired
	VoteDao voteDao;
	
	static final Logger logger = LogManager.getLogger();
	
	public void votefor() {
		Vote vote = new Vote();
		vote.setPollId("1");
		vote.setUserId("20");
		vote.setName("한민기");
		vote.setChoice("2");
		
	try {
			voteDao.addVote(vote);
			logger.debug("투표가 잘 되었습니다.");
		} catch (DuplicateKeyException e) {
			logger.error("이미 투표하셨습니다.");
		}
	}
	
	public void listVotes() {
		final String pollId = "1";
		List<Vote> voteList = voteDao.listVotes(pollId);
		double average = voteDao.getAverage(pollId);

		logger.debug(voteList);
		logger.debug("Average = {}", average);
	}
}
