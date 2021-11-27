package com.hackerearth.hackerills.service;

import java.util.List;

import com.hackerearth.hackerills.entity.HackerBill;

public interface billService {
	public HackerBill addBillService(HackerBill bill);
	public List<HackerBill> getAllBillService();
	public HackerBill getBillSarvice(int billId);
	public List<HackerBill> getBillsOnDueDateService(String dueDate);
}
