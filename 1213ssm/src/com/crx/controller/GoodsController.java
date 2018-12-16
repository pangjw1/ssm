package com.crx.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crx.model.Goods;
import com.crx.service.GoodsService;

@Controller
@RequestMapping("goods")
public class GoodsController {

	@Autowired
	private GoodsService gs;
	
	@RequestMapping("findAll")
	public String findAll(Map<String,Object> map){
		 map.put("goodslist", gs.findAll());
		return "../success";
	}
	
	@RequestMapping("insert")
	public String insert(Goods goods){
		gs.insert(goods);
		return "redirect:/goods/findAll.action";
	}
	
	@RequestMapping("delete")
	public String delete(int id){
		gs.delete(id);
		return "redirect:/goods/findAll.action";
	}
	
	@RequestMapping("yupdate")
	public String yupdate(int id,Map<String,Goods> map){
		map.put("updateGoods", gs.findById(id));
		return "../update";
	}
	
	@RequestMapping("update")
	public String update(Goods goods){
		gs.update(goods);
		return "redirect:/goods/findAll.action";
	}
}
