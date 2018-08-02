package th.go.dss.tcs4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import th.go.dss.tcs4.model.lab.TestMethod;

public interface TestMethodRepository extends JpaRepository<TestMethod, Long>,QuerydslPredicateExecutor<TestMethod> {

}
