package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.ICashierDAO;
import com.crud.sql.dto.Cashier;

@Service
public class CashierServiceImpl implements ICashierService{
	
	@Autowired
	ICashierDAO iCashierDAO;

	@Override
	public List<Cashier> listCashiers() {
		// TODO Auto-generated method stub
		return iCashierDAO.findAll();
	}

	@Override
	public Cashier saveCashier(Cashier cashier) {
		// TODO Auto-generated method stub
		return iCashierDAO.save(cashier);
	}

	@Override
	public Cashier cashierXID(int code) {
		// TODO Auto-generated method stub
		return iCashierDAO.findById(code).get();
	}

	@Override
	public Cashier updateCashier(Cashier cashier) {
		// TODO Auto-generated method stub
		return iCashierDAO.save(cashier);
	}

	@Override
	public void eliminateCashier(int code) {
		// TODO Auto-generated method stub
		iCashierDAO.deleteById(code);
	}
	
	

}
