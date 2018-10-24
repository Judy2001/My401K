package org.launchcode.my401k.models.data;

import org.launchcode.my401k.models.FundCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface FundCategoryDao extends CrudRepository<FundCategory, Integer> {

}