package th.go.dss.tcs4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import th.go.dss.tcs4.model.lab.TestMethod;
import th.go.dss.tcs4.repositories.TestMethodRepository;

public class EntityServiceJPA implements EntityService {
	
	@Autowired
	private TestMethodRepository testMethodRepo;
	
	@Override
	public Page<TestMethod> findAllTestMethod(Pageable pageable) {
		return testMethodRepo.findAll(pageable);
	}

}
