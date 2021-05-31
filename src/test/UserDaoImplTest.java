package test;

import static org.junit.Assert.*;

import org.junit.Test;

import dao.UserDaoImpl;
import model.User;

public class UserDaoImplTest {

	@Test
	public void testGetIdUserTrue() {
		UserDaoImpl instance = new UserDaoImpl();
		User expect = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		
		String id ="B17DCCN496";
		User actual = instance.getIdUser(id);
		assertEquals(expect.toString(), actual.toString());	
	}
	@Test
	public void testGetIdUserFail() {
		UserDaoImpl instance = new UserDaoImpl();
		User expect = new User("B17DCCN496","Đặng Anh Quân","12345", "student");
		
		String id ="B17DCCN111";
		User actual = instance.getIdUser(id);
		assertNotEquals(expect.toString(), actual.toString());	
	}
	@Test
	public void testGetIdUserNull() {
		UserDaoImpl instance = new UserDaoImpl();
		String id =null;
		User actual = instance.getIdUser(id);
		assertFalse(actual.toString().isEmpty());	
	}
	@Test
	public void testGetIdUserEmpty() {
		UserDaoImpl instance = new UserDaoImpl();
		String id ="";
		User actual = instance.getIdUser(id);
		assertFalse(actual.toString().isEmpty());
	}
	

}
