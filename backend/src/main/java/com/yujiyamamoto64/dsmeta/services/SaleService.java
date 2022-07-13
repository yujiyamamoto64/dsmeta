package com.yujiyamamoto64.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujiyamamoto64.dsmeta.entities.Sale;
import com.yujiyamamoto64.dsmeta.repositories.SaleRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	public List<Sale> findAll() {
		return repository.findAll();
	}
}
