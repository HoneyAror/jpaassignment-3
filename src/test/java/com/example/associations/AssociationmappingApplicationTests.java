package com.example.associations;

import com.example.associations.manytomany.Authormanytomany;
import com.example.associations.manytomany.AuthormanytomanyRepo;
import com.example.associations.manytomany.bookmanytomany;
import com.example.associations.onetomany.entities.Address;
import com.example.associations.onetomany.entities.Author;
import com.example.associations.onetomany.entities.Book;
import com.example.associations.onetomany.repos.AuthorRepo;
import com.example.associations.onetoone.entities.Authorone2one;
import com.example.associations.onetoone.entities.Bookone2one;
import com.example.associations.onetoone.repo.Bookone2oneRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@SpringBootTest
class AssociationmappingApplicationTests {
	@Autowired
	AuthorRepo repo;

	@Autowired
	AuthormanytomanyRepo repom2m;

	@Autowired
	Bookone2oneRepo repoone2one;

	@Test
	void contextLoads() {
	}
	@Test
	public void createAuthor(){
		Author a=new Author();
		a.setName("RAM");
		HashSet<Book> h=new HashSet<Book>();
		Book b=new Book();
		b.setBookname("R.D SHARMA");
		h.add(b);
		Book b1=new Book();
		b1.setBookname("R.S Aggrawal");
		h.add(b1);
		a.setBooks(h);

		repo.save(a);
	}

  //MANY TO MANY MAPPING
	@Test
	public void testcreateauthorm2m(){
		Authormanytomany am2m=new Authormanytomany();
		am2m.setName("MEENU");
		HashSet<Book> h=new HashSet<Book>();
		Book b=new Book();
		b.setBookname("R.D SHARMA");
		h.add(b);
		Book b1=new Book();
		b1.setBookname("R.S Aggrawal");
		h.add(b1);
		am2m.setBooks(h);

		repom2m.save(am2m);

	}
      //MANY TO MANY
	@Test
	@Transactional
	public void testm2mfindauthor(){
	 Authormanytomany r=repom2m.findAllById(1);
		System.out.println(r);
		System.out.println(r.getBooks());
	}
	//ONETOMANY

	@Autowired
	AuthorRepo authorRepo;

	@Test
	void testCreateAuthorOneToMany() {
		Author author = new Author();
		author.setName("HONEY");

		Address address = new Address();
		address.setStreetnumber("119");
		address.setLocation("Burari");
		address.setstate("UTTARAKHAND");
		author.setAddress(address);

		Set<Book> books = new HashSet<Book>();
		Book book = new Book();
		book.setBookname("Disney");
		book.setAuthor(author);

		books.add(book);

		Book book1 = new Book();
		book1.setBookname("Nicklodean");
		book1.setAuthor(author);

		books.add(book1);
		author.setBooks(books);

		authorRepo.save(author);
	}


	//ONE TO ONE MAPPING

	@Test
	public void testCreateAuthorOneToOne(){
		Authorone2one author = new Authorone2one();
		author.setName("Doraemon");

		Bookone2one book = new Bookone2one();
		book.setBookName("Disney");
		book.setAuthor(author);

		repoone2one.save(book);
	}

}
