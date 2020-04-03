package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mahasiswa;
import com.example.demo.service.MahasiswaService;

@RestController
public class IndexController {

	@Autowired
	private MahasiswaService mhsService;

	@RequestMapping("/mhs/all")
	public ResponseEntity<?> findAllMhs() {
		try {
			List<Mahasiswa> listMhs = mhsService.findAllMhs();
			return new ResponseEntity<>(listMhs, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Problem", HttpStatus.BAD_GATEWAY);
		}
	}
}
