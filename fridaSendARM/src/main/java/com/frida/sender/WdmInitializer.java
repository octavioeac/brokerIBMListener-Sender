package com.frida.sender;


import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WdmInitializer extends 
AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { WdmConfiguration.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
    	 return new Class<?>[] {WdmConfiguration.class};
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
    
    @Override
    protected Filter[] getServletFilters() {
        Filter [] singleton = { new CorsFilter()};
        return singleton;
    }
}
