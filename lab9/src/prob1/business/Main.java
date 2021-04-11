package prob1.business;

import java.util.*;
import java.util.stream.Collectors;

import prob1.dataaccess.DataAccess;
import prob1.dataaccess.DataAccessFacade;

public class Main {

	public static void main(String[] args) {
		List<LibraryMember> members = List.of(
				new LibraryMember("42376", "last", "first", "123456789", new Address(
						"some", "chicago", "iowa", "5232")),
				new LibraryMember("33333", "last", "first", "123456789", new Address(
						"some", "chicago", "iowa", "5333")),
				new LibraryMember("4276", "last", "first", "123456789", new Address(
						"some", "chicago", "iowa", "5289")),
				new LibraryMember("5222", "last", "first", "123456789", new Address(
						"some", "chicago", "iowa", "52552"))
		);

		System.out.println(allWhoseZipContains3(members));


//		System.out.println(allHavingOverdueBook());
//		System.out.println(allHavingMultipleAuthors());

	}
	//Returns a list of all ids of LibraryMembers whose zipcode contains the digit 3
	public static List<String> allWhoseZipContains3(List<LibraryMember> members) {
		//implement
		return members
				.stream()
				.filter(m -> m.getAddress().getZip().contains("3"))
				.map(LibraryMember::getMemberId)
				.collect(Collectors.toList());
		
	}
	//Returns a list of all ids of  LibraryMembers that have an overdue book
	public static List<String> allHavingOverdueBook(List<LibraryMember> members) {

		//implement

		return null;
		
	}
	
	//Returns a list of all isbns of  Books that have multiple authors
	public static List<String> allHavingMultipleAuthors(List<Book> books) {

			return books
					.stream()
					.filter(book -> book.getAuthors().size() > 1)
					.map(Book::getTitle)
					.collect(Collectors.toList());
		
		}

}
