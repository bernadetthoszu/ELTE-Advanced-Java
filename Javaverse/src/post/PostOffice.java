package post;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PostOffice {
	private String name;
	private Mailbox[] mailboxes;
	private int incomingMailIdx = 0;

	//forwarding map
	Map<String, PostOffice> forwarding = new HashMap<>();
	
	public PostOffice(String name, int mailboxCount, Map<String, PostOffice> forwarding) {
		this.name = name;
		//this.forwarding = forwarding;  => aliasing, encapsulation is hurt!!
		this.forwarding = new HashMap<>(forwarding);
		
		mailboxes = new Mailbox[mailboxCount];  //full of nulls
		for (int i = 0 ; i < mailboxes.length; i++) {
			mailboxes[i] = new Mailbox(i);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty())  throw new IllegalArgumentException();
		this.name = name;
	}
	
	public void receive(Mail mail, LocalDate date) {
		if (mail.getTargetPostOffice().equals(name)) {
			System.out.println("DONE " + name + " at " + date.toString());
			var mailboxIdx = incomingMailIdx % mailboxes.length;
			++incomingMailIdx;
			
			mailboxes[mailboxIdx].process(mail);
			
 			return;
		}
		
		var forward = forwarding.get(mail.getTargetPostOffice());
		if (forward == null) {
			System.out.println("DISCARDING " + mail+ " at " + date.toString());
			return;
		}
		forward.receive(mail, date.plusDays(1));
		
	}
	
	
}
