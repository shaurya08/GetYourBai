package com.bai.service;

import java.util.List;

import com.bai.entity.BaiSuper;
import com.bai.exception.service.BaiServiceException;

public interface BaiService {

	public List<BaiSuper> getAllBais();

	public BaiSuper getBaiById(Long id) throws BaiServiceException;

	public BaiSuper addNewBai(BaiSuper bai);

	public BaiSuper updateBai(BaiSuper bai) throws BaiServiceException;

	public BaiSuper deleteBai(Long id) throws BaiServiceException;

	

}
