package midterm2_mingi.org.jdbc;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"midterm2.xml");
		MemberService memberService = ctx.getBean(MemberService.class);
		//memberService.insertVote();
		memberService.selectAll();
		ctx.close();
}
}
