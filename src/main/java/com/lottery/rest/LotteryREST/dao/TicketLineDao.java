package com.lottery.rest.LotteryREST.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lottery.rest.LotteryREST.lotteryticket.Ticketline;

@Repository
public interface TicketLineDao extends JpaRepository<Ticketline, Integer>{

}
