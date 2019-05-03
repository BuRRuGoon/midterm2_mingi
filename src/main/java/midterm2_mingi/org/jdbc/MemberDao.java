package midterm2_mingi.org.jdbc;

import java.util.List;

import midterm2_mingi.org.jdbc.Member;

public interface MemberDao {

	void insert(Member member);
	
	List<Member> selectAll(int offset, int count);
}
