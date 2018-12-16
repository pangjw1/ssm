package com.crx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crx.mapper.GoodsMapper;
import com.crx.model.Goods;

@Service
public class GoodsService {
     
	@Autowired
	private GoodsMapper gmapper;
	
	public List<Goods> findAll(){
		 return gmapper.findAll();
	}

	public void insert(Goods goods) {
		// TODO Auto-generated method stub
		gmapper.insert(goods);
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		gmapper.delete(id);
	}

	public Goods findById(int id) {
		// TODO Auto-generated method stub
		return gmapper.findById(id);
	}

	public void update(Goods goods) {
		// TODO Auto-generated method stub
		gmapper.update(goods);
	}
}
