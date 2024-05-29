package se.lexicon.workshop_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshop_jpa.repository.AppUserRepository;
import se.lexicon.workshop_jpa.repository.DetailsRepository;

@Component

public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    DetailsRepository detailsRepository;

    public void run(String...args) throws Exception {



    }
}
