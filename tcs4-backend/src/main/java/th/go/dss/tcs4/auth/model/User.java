package th.go.dss.tcs4.auth.model;

import java.util.Set;

public interface User {
	public String getUsername();
	public Set<Role> getRoles();
}
