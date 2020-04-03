package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MahasiswaDao;
import com.example.demo.model.Mahasiswa;

@Service
@Transactional
public class MahasiswaServiceImpl  implements MahasiswaService{
	
	@Autowired
	@Qualifier("mhs_repo_hibernate") //jika pingin ganti jpa ganti qualifiernya jadi mhs_repo_jpa
	private MahasiswaDao mhsDao;

	@Override
	public List<Mahasiswa> findAllMhs() throws Exception {
		return mhsDao.findAllMhs();
	}

}
