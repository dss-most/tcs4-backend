package th.go.dss.tcs4.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecuritry extends WebSecurityConfigurerAdapter {

	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.cors().and()
		.httpBasic().and()
		.authorizeRequests()
			.antMatchers("/index.html", "/", "/home", "/TestMethod", "/test").permitAll()
			.anyRequest().authenticated();
	}
}
