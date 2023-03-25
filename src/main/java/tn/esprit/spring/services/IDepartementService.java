package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;


public interface IDepartementService {

	List<Departement> retrieveAllDepartement(); 
	Departement addDepartement(Departement d);
	void deleteDepartement(int id);
	Departement updateDepartement(Departement d);
	Departement retrieveDepartement(int id);
	
}
