package com.bai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bai.entity.BaiSuper;
import com.bai.exception.BaiApplicationException;
import com.bai.service.BaiService;

@RestController
@RequestMapping("/bai")
public class BaiController {
	
	@Autowired
	private BaiService baiService;
	
	@GetMapping
	public ResponseEntity<List<BaiSuper>> getAllBais() {
		return new ResponseEntity<List<BaiSuper>>(baiService.getAllBais(), HttpStatus.OK);
	}
	
	@GetMapping("/id")
	public ResponseEntity<BaiSuper> getBaiById(@PathVariable Long id) throws BaiApplicationException {
		return new ResponseEntity<BaiSuper>(baiService.getBaiById(id), HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<BaiSuper> addNewBai(@RequestBody BaiSuper bai) {
		return new ResponseEntity<BaiSuper>(baiService.addNewBai(bai), HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<BaiSuper> updateBai(@RequestBody BaiSuper bai) throws BaiApplicationException {
		return new ResponseEntity<BaiSuper>(baiService.updateBai(bai), HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/id")
	public ResponseEntity<BaiSuper> deleteBai(@PathVariable Long id) throws BaiApplicationException {
		return new ResponseEntity<BaiSuper>(baiService.deleteBai(id), HttpStatus.OK);
	}
	
	

}
