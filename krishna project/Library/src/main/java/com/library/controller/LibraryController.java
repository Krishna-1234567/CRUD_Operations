package com.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.library.entity.Library;
import com.library.entity.service.LibraryService;
@RestController
@RequestMapping("/library")
public class LibraryController {
	@Autowired
	private LibraryService service;
	@PostMapping("/addbook")
	public Library addBook(@RequestBody Library lib) {
		return service.addBook(lib);
	}
	@GetMapping({"/","allbooks"})
	List<Library> allLibrary(){
		return service.allLibrary();
	}
	@GetMapping("/book/{id}")
	public Library displayBook(@PathVariable("id")long bookId) {
		return service.displayBook(bookId);
	}
	@PutMapping("/updatebook/{id}")
	public Library updateBook(@PathVariable("id")long bookId,@RequestBody Library lib) {
		Library l=service.displayBook(bookId);
		l.setBookName(lib.getBookName());
		l.setBookAuthor(lib.getBookAuthor());
		l.setBookCategory(lib.getBookCategory());
		l.setBookAvailability(lib.getBookAvailability());
		return service.updateBook(l);
	}
	@DeleteMapping("/deletebook/{id}")
	public Library deleteBook(@PathVariable("id")long bookId) {
		return service.deleteBook(bookId);
	}
	
}
