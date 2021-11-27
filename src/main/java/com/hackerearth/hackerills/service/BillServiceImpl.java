package com.hackerearth.hackerills.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerearth.hackerills.entity.HackerBill;
import com.hackerearth.hackerills.repository.BillRepository;

@Service
public class BillServiceImpl implements billService {

	@Autowired
	private BillRepository billRepository;
	
//	Logic to add the new bill in the database
	
	@Override
	public HackerBill addBillService(HackerBill bill) {
		return billRepository.save(bill);
	}

	@Override
	public List<HackerBill> getAllBillService() {
		return billRepository.findAll();
	}

	@Override
	public HackerBill getBillSarvice(int billId) {
		return billRepository.getById(billId);
	}

	@Override
	public List<HackerBill> getBillsOnDueDateService(String dueDate) {
		List<HackerBill> temp=billRepository.findAll();
		List<HackerBill> res=new ArrayList<HackerBill>();
		for(HackerBill obj:temp) {
			if(obj.getDueDate().equals(dueDate)) {
				res.add(obj);
			}
		}
		return res;
	}

}
