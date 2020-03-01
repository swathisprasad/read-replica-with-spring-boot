package com.techshard.readreplica.service;

import com.techshard.readreplica.entity.Blog;
import com.techshard.readreplica.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BlogService {

    @Autowired
    private BlogRepository blogRepository;

    public Blog save(final Blog blog) {
        return blogRepository.save(blog);
    }

    @Transactional(readOnly = true)
    public Blog get(final long id) {
        return blogRepository.findById(id).orElse(null);
    }
}
