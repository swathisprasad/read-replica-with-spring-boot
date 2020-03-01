package com.techshard.readreplica.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@EqualsAndHashCode
@Entity
@Table(name = "blog")
public class Blog {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "title", nullable = false)
    private String title;

    @Column (name = "author", nullable = false)
    private String author;

    @Column (name = "published_date", nullable = false)
    private LocalDate publishedDate;
}
