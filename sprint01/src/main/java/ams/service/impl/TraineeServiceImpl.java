package ams.service.impl;

import ams.model.entity.Trainee;
import ams.repository.TraineeRepository;
import ams.service.TraineeService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TraineeServiceImpl implements TraineeService {
    private final TraineeRepository traineeRepository;


    public TraineeServiceImpl(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;

    }

    @Override
    public Trainee createOrUpdate(Trainee model) {
        return null;
    }

    @Override
    public Trainee create(Trainee trainee) {
        trainee.setCreatedDate(LocalDateTime.now());
        trainee.setLastModifiedDate(LocalDateTime.now());
        return traineeRepository.save(trainee);
    }

    @Override
    public Trainee update(Trainee trainee) {
        trainee.setLastModifiedDate(LocalDateTime.now());
        return traineeRepository.save(trainee);
    }

    @Override
    public List<Trainee> createOrUpdate(List<Trainee> trainees) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Trainee findOne(Long aLong) {
        return null;
    }

    @Override
    public Optional<Trainee> findOneOpt(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Trainee> findAll() {
        return null;
    }

    @Override
    public Page<Trainee> findAll(Specification<Trainee> spec, Pageable page) {
        return null;
    }

    @Override
    public Page<Trainee> findUndeletedAll(Pageable page) {
        return null;
    }

    @Override
    public boolean exists(Long aLong) {
        return false;
    }
}
