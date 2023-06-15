package com.Ryoshi.contentcalender.repository;

import com.Ryoshi.contentcalender.model.Content;
import com.Ryoshi.contentcalender.model.Status;
import com.Ryoshi.contentcalender.model.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> content = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll(){
        return content;
    }

    public Optional<Content> findById(Integer id){
        return content.stream().filter(c->c.id().equals(id)).findFirst();
    }

    @PostConstruct
    private void init(){
        Content c = new Content(
                1,
                "Title",
                "Description",
                Status.IDEA,
                Type.COURSE,
                LocalDateTime.now(),
                null,
                ""
        );

        content.add(c);
    }

}
