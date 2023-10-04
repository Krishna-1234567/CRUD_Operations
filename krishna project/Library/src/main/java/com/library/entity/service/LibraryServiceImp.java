package com.library.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.entity.Library;
import com.library.repository.LibraryRepository;
@Service
public class LibraryServiceImp implements LibraryService{
	@Autowired
	private LibraryRepository dao;
	@Override
	public Library addBook(Library lib) {
		// TODO Auto-generated method stub
		return dao.save(lib);
	}

	@Override
	public Library updateBook(Library lib) {
		// TODO Auto-generated method stub
		return dao.save(lib);
	}

	@Override
	public Library deleteBook(long bookId) {
		// TODO Auto-generated method stub
		dao.deleteById(bookId);
		return null;
	}

	@Override
	public List<Library> allLibrary() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Library displayBook(long bookId) {
		// TODO Auto-generated method stub
		return dao.findById(bookId).get();
	}

}
