package tn.esprit.spring.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {

	@Autowired
	IDepartementService dp;
	
	
	@Test
	public void A_testAddDepartement() throws ParseException {
		
		Departement d = new Departement("test avec jenkissssnsss"); 
		Departement DepartementAdded = dp.addDepartement(d); 
		Assert.assertEquals(d.getName(), DepartementAdded.getName());
	}
	
	@Test
	public void B_testRetrieveAllDepartement() {
		List<Departement> listDepartements = dp.retrieveAllDepartement(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(8, listDepartements.size());
	}
	
 
	@Test
	public void C_testModifyDepartement() throws ParseException   {
		Departement d = new Departement(4,"test de valdiation");
		Departement DepartementUpdated = dp.updateDepartement(d); 
		Assert.assertEquals(d.getName(), DepartementUpdated.getName());
	}

//	@Test
//	public void AB_testRetrieveDepartement() {
//		Departement departementRetrieved = dp.retrieveDepartement(9);
//		Assert.assertEquals(9, departementRetrieved.getId());
//	}
//
//	@Test
//	public void D_testDeleteDepartement() {
//		dp.deleteDepartement(9);
//		Assert.assertNull(dp.retrieveDepartement(9));
//
//	}
	
	// 5 tests unitaires  

	
}
