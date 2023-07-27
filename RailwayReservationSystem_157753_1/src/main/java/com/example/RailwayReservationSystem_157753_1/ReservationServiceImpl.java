package com.example.RailwayReservationSystem_157753_1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservationServiceImpl {

	@Autowired
	IReservationService service;
	
	@PostMapping("/insertData")                             //for inserting data in the collection through postman
	@ExceptionHandler(RailwayReservationException.class)  
	public String insert(@RequestBody RailwayReservation reserve)
	{
		System.out.println(reserve);
		service.save(reserve);
		return "SUCCESS";
	}
	
	@GetMapping("/selectData/{pnrno}")                      //getting data through passing pnrno in postman
	@ExceptionHandler(RailwayReservationException.class) 
	public List<RailwayReservation> select(@PathVariable("pnrno")String pnrno)  throws RailwayReservationException
	{
		List<RailwayReservation> res=service.getByPnrno(pnrno);
	    if(res.isEmpty()){
	        throw new RailwayReservationException("PNR Not Found worng pnr no" +pnrno);                //if exception exist then it will send pnrno as message to exception handler
	    }
	    else{
	        return service.getByPnrno(pnrno);
	    }	
	}

}
