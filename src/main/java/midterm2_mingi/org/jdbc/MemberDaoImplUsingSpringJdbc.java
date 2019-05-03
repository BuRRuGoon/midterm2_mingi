package midterm2_mingi.org.jdbc;

import java.util.List;

import midterm2_mingi.org.jdbc.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository("memberDao")
public class MemberDaoImplUsingSpringJdbc implements MemberDao {
	static final String SELECT_ALL = "SELECT pollId, userId, name, choice FROM vote ORDER BY userId desc LIMIT ?,?";

	static final String INSERT = "INSERT vote(pollId, userId, name, choice) VALUES(?, ?, ?, ?)";
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	RowMapper<Member> memberRowMapper = new BeanPropertyRowMapper<>(
			Member.class);


	@Override
	public void insert(Member member) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(INSERT,member.getPollid(),member.getUserid(),member.getName(),member.getChoice());
	}




	@Override
	public List<Member> selectAll(int offset, int count) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(SELECT_ALL, memberRowMapper,0,100);
	}
	
}
