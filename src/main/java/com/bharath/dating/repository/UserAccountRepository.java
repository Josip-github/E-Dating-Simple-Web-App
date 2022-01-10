package com.bharath.dating.repository;

import com.bharath.dating.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserAccountRepository extends JpaRepository<UserAccount, Integer> {

    @Query("from UserAccount where age=:age and city=:city and country=:country and id <> :id")
    List<UserAccount> findMatches(@Param("age") Integer age,@Param("city") String city,
                                  @Param("country") String country,@Param("id") Integer id);
}
