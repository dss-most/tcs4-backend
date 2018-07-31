package th.go.dss.tcs4.services;

import th.go.dss.tcs4.model.lab.TestMethod;

public interface EntityService {
	public Iterable<TestMethod> findAllTestMethod();
}
