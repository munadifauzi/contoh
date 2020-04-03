package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Mahasiswa;

public interface MahasiswaDao {

	abstract List<Mahasiswa> findAllMhs() throws Exception;
}
