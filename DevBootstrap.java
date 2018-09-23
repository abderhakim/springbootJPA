package com.abel.myhakimwebapp.Bootstrap;

import com.abel.myhakimwebapp.model.Author;
import com.abel.myhakimwebapp.model.Book;
import com.abel.myhakimwebapp.model.Publisher;
import com.abel.myhakimwebapp.repoistory.BookRepoitory;
import com.abel.myhakimwebapp.repoistory.PublisherRepository;
import com.abel.myhakimwebapp.repoistory.authorRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
   private authorRepository athrep;
   private BookRepoitory bookrep;
   private PublisherRepository pubrep;

    public DevBootstrap(authorRepository athrep, BookRepoitory bookrep, PublisherRepository pubrep) {
        this.athrep = athrep;
        this.bookrep = bookrep;
        this.pubrep = pubrep;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
      initData();
    }
    private void initData(){

        Publisher pub=new Publisher();
        pub.setName("khalid");
        pub.setAddress("6040 14th");
        pubrep.save(pub);

        

        //hakim
       Author auth=new Author("hakim","muzemil") ;
       Book book=new Book("Java Hibernate","1234",pub);
       auth.getListbooks().add(book);
       book.getLisauthors().add(auth);
       athrep.save(auth);
       bookrep.save(book);
        //Abel
        Author auth1=new Author("abel","Abdu") ;
        Book book1=new Book("Ethiopian History","12346",pub);
        auth1.getListbooks().add(book1);
        book1.getLisauthors().add(auth1);
        athrep.save(auth1);
        bookrep.save(book1);


    }

}
