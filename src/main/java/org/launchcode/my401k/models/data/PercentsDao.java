package org.launchcode.my401k.models.data;

import org.launchcode.my401k.models.Percents;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface PercentsDao extends CrudRepository<Percents, Integer> {

}