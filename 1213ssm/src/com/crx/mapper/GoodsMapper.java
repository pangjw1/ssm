package com.crx.mapper;

import java.util.List;

import com.crx.model.Goods;

public interface GoodsMapper {
    public List<Goods> findAll();

	public void insert(Goods goods);

	public void delete(int id);

	public Goods findById(int id);

	public void update(Goods goods);
}
