package com.lottery.rest.LotteryREST.lotterycontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.rest.LotteryREST.lotteryticket.LotteryTicket;
import com.lottery.rest.LotteryREST.lotteryticket.Ticketline;
import com.lottery.rest.LotteryREST.service.ILotteryService;

@RestController
public class LotteryController {

	@Autowired
	private ILotteryService lotteryservice;

	@RequestMapping(value = "/ticket", 
					method = RequestMethod.POST)
	public ResponseEntity <String> createTicket(@RequestBody List<Ticketline> ticket) {
		System.out.println("Creating ticket " + ticket.get(0));
		lotteryservice.createTicket(ticket);
		return ResponseEntity.ok("puchi");
	}

	@RequestMapping(value = "/ticket", 
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<LotteryTicket>> getAllTickets(){
		return ResponseEntity.ok(lotteryservice.getAllTickets());
	}
	
	@RequestMapping(value = "/ticket/{id}",
					method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<LotteryTicket> getIndividualTicket(@PathVariable("id") int id){
		Optional<LotteryTicket> lotteryTicket = lotteryservice.getIndividualTicket(id);

		if(lotteryTicket.isPresent()) {
			return ResponseEntity.ok(lotteryTicket.get());
		} else {
			return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
	
	@RequestMapping(value = "/ticket/{id}",
					method = RequestMethod.PUT)
	public ResponseEntity<LotteryTicket> ammendTicketlines(@PathVariable("id") int id, @RequestBody List<Ticketline> ticketLine){
		
		lotteryservice.amendTicketLines(id, ticketLine);
		
		return null;
		
	}
}
