package th.go.dss.tcs4.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import th.go.dss.tcs4.model.lab.TestMethod;

public interface EntityService {
	public Page<TestMethod> findAllTestMethod(Pageable pageable);
}
