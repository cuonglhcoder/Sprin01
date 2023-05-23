package ams.service;

import ams.model.entity.Trainee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

public interface TraineeService extends BaseService<Trainee, Long> {
}
