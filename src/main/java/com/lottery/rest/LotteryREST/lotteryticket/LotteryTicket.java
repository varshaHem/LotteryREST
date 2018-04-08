package com.lottery.rest.LotteryREST.lotteryticket;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class LotteryTicket {
	
	@Id
	@GeneratedValue
	private int ticket_id;
	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	@OneToMany (cascade=CascadeType.ALL)
	private List<Ticketline> ticketLine;
	
	public LotteryTicket() {
		
	}

	public LotteryTicket(List<Ticketline> ticketLine) {
		super();
		this.ticketLine = ticketLine;
	}

	public List<Ticketline> getTicketLine() {
		return ticketLine;
	}

	public void setTicketLine(List<Ticketline> ticketLine) {
		this.ticketLine = ticketLine;
	}

}
