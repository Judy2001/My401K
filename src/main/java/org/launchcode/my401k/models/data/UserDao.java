package org.launchcode.my401k.models.data;

import org.launchcode.my401k.models.Signup;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserDao extends CrudRepository<Signup, Integer> {
}
