package org.launchcode.my401k.models.data;

import org.launchcode.my401k.models.SpecificFund;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional
public interface SpecificFundDao extends CrudRepository<SpecificFund, Integer> {

}