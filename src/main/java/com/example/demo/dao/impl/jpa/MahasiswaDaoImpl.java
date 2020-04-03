package com.example.demo.dao.impl.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.MahasiswaDao;
import com.example.demo.model.Mahasiswa;

@Repository("mhs_repo_jpa")
public class MahasiswaDaoImpl implements MahasiswaDao {

	@Autowired
	private MahasiswaRepo mhsRepo;

	@Override
	public List<Mahasiswa> findAllMhs() throws Exception {
		return mhsRepo.findAll();
	}

}
