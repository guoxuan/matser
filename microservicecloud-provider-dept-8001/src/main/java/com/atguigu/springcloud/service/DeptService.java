package com.atguigu.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atguigu.springcloud.entities.Dept;

@Service
public interface DeptService {

	public boolean add(Dept dept);

	public Dept get(Long id);

	public List<Dept> list();
}
