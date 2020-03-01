package com.techshard.readreplica;

import com.techshard.readreplica.entity.Blog;
import com.techshard.readreplica.service.BlogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        final ApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        final Blog blog = new Blog();
        blog.setTitle("Hello World 1");
        blog.setAuthor("Author 1");
        blog.setPublishedDate(LocalDate.now());
        applicationContext.getBean(BlogService.class).save(blog);
        applicationContext.getBean(BlogService.class).get(1);

        blog.setTitle("Hello World 2");
        blog.setAuthor("Author 2");
        blog.setPublishedDate(LocalDate.now());
        applicationContext.getBean(BlogService.class).save(blog);
        applicationContext.getBean(BlogService.class).get(2);
    }

}
