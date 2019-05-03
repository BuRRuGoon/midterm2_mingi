package midterm2_mingi.org.jdbc;

public class Member {
	String pollId;
	String userId;
	String name;
	String choice;
	String cdate;
	
	public Member() {
		
	}
	
	public Member(String pollId, String userId, String name, String choice) {
		this.userId=userId;
		this.name=name;
		this.pollId=pollId;
		this.choice=choice;
	}
	
	public String getPollid() {
		return pollId;
	}
	
	public void setPollid(String pollId) {
		this.pollId = pollId;
	}
	
	public String getUserid() {
		return userId;
	}
	public void setUserid(String userId) {
		this.userId = userId;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice=choice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	@Override
	public String toString() {
		return "Vote [pollId=" + pollId + ", userId=" + userId
				+ ", name=" + name + ", choice=" + choice
				+ "]\n";
}

}
