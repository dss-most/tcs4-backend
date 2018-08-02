package th.go.dss.tcs4.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.querydsl.core.BooleanBuilder;

import th.go.dss.tcs4.model.lab.QTestMethod;
import th.go.dss.tcs4.model.lab.TestMethod;
import th.go.dss.tcs4.repositories.TestMethodRepository;

public class EntityServiceJPA implements EntityService {
	
	@Autowired
	private TestMethodRepository testMethodRepo;
	
	@Override
	public Page<TestMethod> findAllTestMethod(String query, Pageable pageable) {
		QTestMethod q = QTestMethod.testMethod;
		BooleanBuilder p = new BooleanBuilder();
		
		p = p.and(q.nameTh.containsIgnoreCase(query).or(q.code.containsIgnoreCase(query)))
				.and(q.code.isNotNull().or(q.code.isNotEmpty()));
		
		return testMethodRepo.findAll(p, pageable);
	}

}
