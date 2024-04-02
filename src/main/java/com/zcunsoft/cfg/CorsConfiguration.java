/**
 * 
 */
package com.zcunsoft.cfg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author mersey
 *
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*").allowedMethods("*")
				.allowedHeaders("x-requested-with", "accept", "authorization", "content-type")
				.exposedHeaders("access-control-allow-headers", "access-control-allow-methods",
						"access-control-allow-origin", "access-control-max-age", "X-Frame-Options")
				.allowCredentials(true).maxAge(3600);
	}

//	@Override
//	public void addInterceptors(InterceptorRegistry registry)
//	{
//		registry.addInterceptor(new AuthInterceptor()).addPathPatterns("/**");
//	}
}