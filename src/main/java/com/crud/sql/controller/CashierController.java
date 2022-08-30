package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Cashier;
import com.crud.sql.service.CashierServiceImpl;

@RestController
@RequestMapping("/api")
public class CashierController {
	
	@Autowired
	CashierServiceImpl cashierServiceImpl;
	
	@GetMapping("/cashiers")
	public List<Cashier> listCahiers(){
		return cashierServiceImpl.listCashiers();
	}
	
	
	@PostMapping("/cashiers")
	public Cashier saveCashier(@RequestBody Cashier cashier) {
		
		return cashierServiceImpl.saveCashier(cashier);
	}
	
	
	@GetMapping("/cashiers/{code}")
	public Cashier EstudianteXID(@PathVariable(name="code") int code) {
		
		Cashier cashier_xid= new Cashier();		
		cashier_xid=cashierServiceImpl.cashierXID(code);
		
		return cashier_xid;
	}
	
	@PutMapping("/cashiers/{code}")
	public Cashier actualizarEstudiante(@PathVariable(name="code")int code,@RequestBody Cashier cashier) {
		
		Cashier cashier_selected= new Cashier();
		Cashier cashier_updated= new Cashier();
		
		cashier_selected= cashierServiceImpl.cashierXID(code);
		
		cashier_selected.setSurnameName(cashier.getSurnameName()); 
		
		cashier_updated = cashierServiceImpl.updateCashier(cashier_selected);
		
		return cashier_updated;
	}
	
	@DeleteMapping("/cashiers/{id}")
	public void eliminateCashier(@PathVariable(name="code")int code) {
		cashierServiceImpl.eliminateCashier(code);
	}

}
