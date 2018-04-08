package com.lottery.rest.LotteryREST.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lottery.rest.LotteryREST.lotteryticket.LotteryTicket;

@Repository
public interface LotteryDao extends JpaRepository<LotteryTicket, Integer> {

	//public void createTicket(List<Ticketline> ticket);
}
