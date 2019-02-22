package com.mul.mappet.service;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mul.mappet.dao.BoardDAO;

@Service
public class PlaceServiceImpl implements PlaceService {
	@Autowired
	private BoardDAO boardDAO;

	@Override
	public Date test() {
		return boardDAO.test();
	}
}
