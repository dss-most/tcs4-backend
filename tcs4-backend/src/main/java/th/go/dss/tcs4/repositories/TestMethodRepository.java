package th.go.dss.tcs4.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import th.go.dss.tcs4.model.lab.TestMethod;

public interface TestMethodRepository extends JpaRepository<TestMethod, Long>,QuerydslPredicateExecutor<TestMethod> {


	@Query(""
			+ "SELECT testMethod "
			+ "FROM TestMethod testMethod "
			+ "WHERE testMethod.id > 5402000 "
			+ "	AND testMethod.code is not null ")
	public List<TestMethod> findAll();
}
