package com.hackerearth.hackerills.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hackerearth.hackerills.entity.HackerBill;
import com.hackerearth.hackerills.service.billService;

@RestController
public class BillController {

	@Autowired
	private billService billservice;
	
	@GetMapping("/testing")
	public String getTetsing(){
		return "Working Fine";
	}
	
//	Post request to add the Bill in the Database
	@PostMapping("/bill")
	public HackerBill addBill(@RequestBody HackerBill bill) {
		return billservice.addBillService(bill);
	}
	
	@GetMapping("/bills")
	public List<HackerBill> getAllBill(){
		return billservice.getAllBillService();
	}
	
	@GetMapping("/bills/{id}")
	public HackerBill getBill(@PathVariable String id) {
		return billservice.getBillSarvice(Integer.parseInt(id));
	}
	
	@GetMapping("/bills/due/{dueDate}")
	public List<HackerBill> getBillsOnDueDate(@PathVariable String dueDate){
		return this.billservice.getBillsOnDueDateService(dueDate);
	}
}
