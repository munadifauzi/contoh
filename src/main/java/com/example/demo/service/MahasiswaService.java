package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Mahasiswa;

public interface MahasiswaService {

	abstract List<Mahasiswa> findAllMhs() throws Exception;
}
