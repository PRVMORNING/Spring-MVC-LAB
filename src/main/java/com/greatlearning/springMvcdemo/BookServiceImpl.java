package com.greatlearning.springMvcdemo;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BookServiceImpl implements Bookservice {
	
	
    private SessionFactory sessionFactory;

    private Session session;
    @Autowired
	public BookServiceImpl(SessionFactory sessionFactory) 
    {
		super();
		this.sessionFactory = sessionFactory;
		
		try 
		{
		session = sessionFactory.getCurrentSession();
		}
		catch (HibernateException  e) {
			session=sessionFactory.openSession();
			// TODO: handle exception
		}
	}

	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		
		Transaction txn=session.beginTransaction();
      session.save(book);
      txn.commit();
      System.out.println("Book saved successfully"+book.getBookId());
      
	}

	@Override
	public void deleteId(int bookId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Book findBook(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchBy(String bookName, String author) {
		// TODO Auto-generated method stub
		return null;
	}

}
