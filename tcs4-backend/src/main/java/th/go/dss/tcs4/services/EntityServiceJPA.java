package th.go.dss.tcs4.services;

import org.springframework.beans.factory.annotation.Autowired;

import th.go.dss.tcs4.model.lab.TestMethod;
import th.go.dss.tcs4.repositories.TestMethodRepository;

public class EntityServiceJPA implements EntityService {
	
	@Autowired
	private TestMethodRepository testMethodRepo;
	
	@Override
	public Iterable<TestMethod> findAllTestMethod() {
		return testMethodRepo.findAll();
	}

}
