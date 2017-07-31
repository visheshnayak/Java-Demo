package com.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.demo.beans.Book;
@Component
public class BookValidator implements Validator {

	public BookValidator() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean supports(Class<?> class1) {
		// TODO Auto-generated method stub
		
		return class1.equals(Book.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		// TODO Auto-generated method stub\
		Book book=(Book)object;
//		if(book.getBookName().length()==0)
//		{
//			errors.rejectValue("bookName","book.bookName.required","enter the bookname");
//		}
//		if(book.getPrice()<=10)
//			errors.rejectValue("ISBN", "book.ISBN.required","add ISBN");
//		if(book.getAuthor().length()==0)
//		{
//			errors.rejectValue("author","book.author.required","enter the author");
//		}
//		if(book.getPublication().length()==0)
//			errors.rejectValue("publication", "book.publication.required","add publication");
//		
//		if(book.getDescription().length()==0)
//			errors.rejectValue("description", "book.description.required","add description");
//		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "bookName", "bookName.required","enter the bookname");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "author","book.author", "enter author");
		ValidationUtils.rejectIfEmpty(errors, "ISBN","book.ISBN", "add ISBN");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price","book.price", "enter price");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "publication","book.publication", "enter publication");
		System.out.println("errors");
		
	}

}




