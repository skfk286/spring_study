package com.ycjung.service;

import org.springframework.ui.Model;

import com.ycjung.dao.DAO;

public class DeleteAllCommand implements Command {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		dao.deleteAll();
	}
}
