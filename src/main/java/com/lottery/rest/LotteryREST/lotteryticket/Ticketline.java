package com.lottery.rest.LotteryREST.lotteryticket;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ticketline {

	@Id
	@GeneratedValue
	private int line_id;
	
	private int a,b,c,result;
	
	@ManyToOne (cascade=CascadeType.ALL)
	private LotteryTicket ticket;
	
	public int getLine_id() {
		return line_id;
	}

	public void setLine_id(int line_id) {
		this.line_id = line_id;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Ticketline() {}

	public Ticketline(int a, int b, int c, int result, LotteryTicket lotteryTicket) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.result = result;
		this.ticket = lotteryTicket;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public LotteryTicket getTicket() {
		return ticket;
	}

	public void setTicket(LotteryTicket ticket) {
		this.ticket = ticket;
	}
	
}
