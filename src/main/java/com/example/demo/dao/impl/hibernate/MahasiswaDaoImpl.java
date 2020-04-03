package com.example.demo.dao.impl.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.MahasiswaDao;
import com.example.demo.model.Mahasiswa;

@Repository("mhs_repo_hibernate")
public class MahasiswaDaoImpl extends BaseHibernate implements MahasiswaDao {

	@Override
	public List<Mahasiswa> findAllMhs() throws Exception {
		Query q = em.createQuery(" from Mahasiswa");
		return q.getResultList();
	}

}
