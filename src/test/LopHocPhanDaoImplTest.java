package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.LopHocPhanDaoImpl;
import model.LopHocPhan;

public class LopHocPhanDaoImplTest {

	@Test
	public void testSearchLHPByTMHTrue() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1",
				3, "INT130","2",1,"302","123456789012",1 );
		List<LopHocPhan> actual = new ArrayList<>();
		actual.add(lophocphan);
		String ten = "Đại số 1";
		List<LopHocPhan> expect = instance.search(ten);
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchLHPByTMHFail() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1", 
				3, "INT130","2",1,"302","123456789012",1 );
		List<LopHocPhan> actual = new ArrayList<>();
		actual.add(lophocphan);
		String ten = "Đại số";
		List<LopHocPhan> expect = instance.search(ten);
		assertNotEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchLHPByTMHNull() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		String ten = null;
		List<LopHocPhan> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}

	@Test
	public void testSearchLHPByTMHEmpty() {

		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		String ten = "";
		List<LopHocPhan> expect = instance.search(ten);
		assertFalse(expect.toString().isEmpty());
	}

	@Test
	public void testSearchLHPByIDMHTrue() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1", 
				3, "INT130","2",1,"302","123456789012",1 );
		List<LopHocPhan> actual = new ArrayList<>();
		actual.add(lophocphan);
		String id = "INT123";
		List<LopHocPhan> expect = instance.search1(id);
		assertEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchLHPByIDMHFail() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1",
				3, "INT130","2",1,"302","123456789012",1 );
		List<LopHocPhan> actual = new ArrayList<>();
		actual.add(lophocphan);
		String id = "INT111";
		List<LopHocPhan> expect = instance.search1(id);
		assertNotEquals(expect.toString(), actual.toString());
	}
	@Test
	public void testSearchLHPByIDMHNull() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		String id = null;
		List<LopHocPhan> expect = instance.search1(id);
		assertFalse(expect.toString().isEmpty());
	}

	@Test
	public void testSearchLHPByIDMHEmpty() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		String id = "";
		List<LopHocPhan> expect = instance.search1(id);
		assertFalse(expect.toString().isEmpty());
	}


	@Test
	public void testGetLHPByIDTrue() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1",
				3, "INT130","2",1,"302","123456789012",1 );
		int id=1;
		LopHocPhan expect = instance.get(id);
		assertEquals(expect.toString(),lophocphan.toString());
	}
	@Test
	public void testGetLHPByIDFail() {
		LopHocPhanDaoImpl instance = new LopHocPhanDaoImpl();
		LopHocPhan lophocphan = new LopHocPhan(1,"INT123","Đại số 1","1", 3,
				"INT130","2",1,"302","123456789012",1 );
		int id = 10;
		LopHocPhan expect = instance.get(id);
		assertNotEquals(expect.toString(), lophocphan.toString());
	}
}
