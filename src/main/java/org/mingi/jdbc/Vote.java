package org.mingi.jdbc;

public class Vote {
	String pollId;
	String userId;
	String name;
	String choice;
	
	public String getPollId() {
		return pollId;
	}
	public void setPollId(String pollId) {
		this.pollId = pollId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	@Override
	public String toString() {
		return "\n vote [pollId=" + pollId + ", userId=" + userId + ", name=" + name + ", choice=" + choice + "]";
	}
}
