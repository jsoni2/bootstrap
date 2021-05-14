package com.udacity.bootstrap.repository;

import com.udacity.bootstrap.entity.Location;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by janaksoni on 5/14/21.
 */
public interface LocationRepository extends CrudRepository<Location, Long> {
}
