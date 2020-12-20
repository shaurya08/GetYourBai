package com.bai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bai.entity.BaiSuper;
import com.bai.exception.custom.BaiNotFoundException;
import com.bai.exception.service.BaiServiceException;
import com.bai.repository.BaiRepository;
import com.bai.service.BaiService;

@Service
public class BaiServiceImpl implements BaiService {

	@Autowired
	private BaiRepository baiRepository;
	
	@Override
	public List<BaiSuper> getAllBais() {
		return baiRepository.findAll();
	}

	@Override
	public BaiSuper getBaiById(Long id) throws BaiServiceException {
		return baiRepository.findById(id).orElseThrow(() -> new BaiNotFoundException("No Such Bai Exists"));
	}

	@Override
	public BaiSuper addNewBai(BaiSuper bai) {
		return baiRepository.save(bai);
	}

	@Override
	public BaiSuper updateBai(BaiSuper bai) throws BaiServiceException {
		BaiSuper temp = baiRepository.findById(bai.getBaiId()).orElseThrow(() -> new BaiNotFoundException("No Such Bai Exists"));
		temp.setBaiId(bai.getBaiId());
		baiRepository.save(temp);
		return temp;
	}

	@Override
	public BaiSuper deleteBai(Long id) throws BaiServiceException {
		BaiSuper temp = baiRepository.findById(id).orElseThrow(() -> new BaiNotFoundException("No Such Bai Exists"));
		baiRepository.deleteById(id);
		return temp;
	}

}
