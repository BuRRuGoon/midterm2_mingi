package midterm2_mingi.org.jdbc;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import midterm2_mingi.org.jdbc.DuplicateMemberException;
import midterm2_mingi.org.jdbc.Member;

@Service
public class MemberService {
	Logger logger = LogManager.getLogger();
	@Autowired
	MemberDao memberDao = null;
	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		List<Member> members = memberDao.selectAll(0, 100);
		logger.debug(members);
	}
	 
	public void insertVote() throws DuplicateMemberException { 
		Member member = new Member();
		member.setPollid("1");
		member.setUserid("22");
		member.setName("한민기");
		member.setChoice("1");
		if (member.userId != null) {
			throw new DuplicateMemberException("이미투표하셨습니다" + member.getUserid());
		}
		memberDao.insert(member);
		logger.debug("투표가 잘 되었습니다");
	}
}
