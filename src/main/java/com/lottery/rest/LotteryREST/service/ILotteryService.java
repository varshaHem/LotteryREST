package com.lottery.rest.LotteryREST.service;

import java.util.List;
import java.util.Optional;

import com.lottery.rest.LotteryREST.lotteryticket.LotteryTicket;
import com.lottery.rest.LotteryREST.lotteryticket.Ticketline;

public interface ILotteryService {

	public void createTicket( List<Ticketline> ticket);
	public List<LotteryTicket> getAllTickets();
	public Optional<LotteryTicket> getIndividualTicket(int id);
	public void amendTicketLines(int id, List<Ticketline> ticketLine);
}
