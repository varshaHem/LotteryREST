package com.lottery.rest.LotteryREST.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.rest.LotteryREST.dao.LotteryDao;
import com.lottery.rest.LotteryREST.dao.TicketLineDao;
import com.lottery.rest.LotteryREST.lotteryticket.LotteryTicket;
import com.lottery.rest.LotteryREST.lotteryticket.Ticketline;

@Service
public class LotteryServiceImpl implements ILotteryService{
	
	@Autowired
	private LotteryDao lotteryDao;
	
	@Autowired
	private TicketLineDao ticketLineDao;

	@Override
	public void createTicket(List<Ticketline> ticket) {
		
		lotteryDao.save(new LotteryTicket(ticket));
		
	}

	@Override
	public List<LotteryTicket> getAllTickets() {
		return lotteryDao.findAll();
	}

	@Override
	public Optional<LotteryTicket> getIndividualTicket(int id) {
		// TODO Auto-generated method stub
		return lotteryDao.findById(id);
	}

	@Override
	public void amendTicketLines(int id, List<Ticketline> ticketLine) {
		LotteryTicket ticket = lotteryDao.findById(id).get();
		
		ticket.getTicketLine().addAll(ticketLine);
		lotteryDao.save(ticket);
	}
	

}
