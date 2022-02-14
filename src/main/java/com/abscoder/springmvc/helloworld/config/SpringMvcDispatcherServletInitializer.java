package com.abscoder.springmvc.helloworld.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author abscoder
 */
public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getServletConfigClasses(){
        return new Class[]{
                AppConfig.class
        };
    }

    @Override
    protected Class<?>[] getRootConfigClasses (){
        return null;
    }

    @Override
    protected String[] getServletMappings(){
        return new String[]{
                "/"
        };
    }

}
