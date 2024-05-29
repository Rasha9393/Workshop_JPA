package se.lexicon.workshop_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshop_jpa.entity.AppUser;

import java.time.LocalDate;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser,String> {

    //SELECT * from appUser where username = ?
    AppUser findAppUserByUsername(String username);

    //SELECT * from appUser where RegDate BETWEEN ? and ?
    AppUser findAppUserByRegDateBetween(LocalDate date1, LocalDate date2);

    AppUser findAppUserByUserDetails_Id(int id);

    AppUser findAppUserByUserDetails_EmailIgnoreCase(String email);


}
