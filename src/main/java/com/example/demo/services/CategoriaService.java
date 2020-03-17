package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.CategoriaRepository;
import com.example.demo.domain.Categoria;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
