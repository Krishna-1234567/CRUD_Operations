package com.library.entity.service;

import java.util.List;

import com.library.entity.Library;

public interface LibraryService {
	Library addBook(Library lib);
	Library updateBook(Library lib);
	Library deleteBook(long bookId);
	List<Library> allLibrary();
	Library displayBook(long bookId);
}
