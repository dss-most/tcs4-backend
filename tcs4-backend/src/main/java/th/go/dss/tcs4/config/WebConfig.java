package th.go.dss.tcs4.config;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module.Feature;



@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
	 @Override
	    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		 
		  	Hibernate5Module hm = new Hibernate5Module();
	        hm.enable(Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);
		 
	        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
	                .indentOutput(true)
	                .dateFormat(new SimpleDateFormat("yyyy-MM-dd", Locale.US))
	                .modulesToInstall(hm);
	        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
	    } 
	
}
