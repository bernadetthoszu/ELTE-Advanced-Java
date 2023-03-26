package post;

import java.util.ArrayList;
import java.util.List;

public class Mailbox {
	private int idx;
	private List<Mail> mails = new ArrayList();
	
	public Mailbox(int idx) {
		this.idx = idx;
	}
	
	public void process(Mail mail) {
		mails.add(mail);
		System.out.println("PROCESSED " + idx + " " + mail);
	}
}
